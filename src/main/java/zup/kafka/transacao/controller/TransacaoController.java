package zup.kafka.transacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zup.kafka.transacao.model.EventoDeTransacao;
import zup.kafka.transacao.repository.TransacaoRepository;

import java.util.List;

@RestController
@RequestMapping("transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("{id}/recentes")
    public ResponseEntity<?> buscarUltimasTransacoes(@PathVariable("id") String id) {
        List<EventoDeTransacao> ultimasTransacoes = transacaoRepository.findFirst10ByCartaoIdOrderByEfetivadaEmDesc(id);
        if(ultimasTransacoes.size() == 0)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(ultimasTransacoes);
    }
}
