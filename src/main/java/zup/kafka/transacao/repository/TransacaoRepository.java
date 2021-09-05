package zup.kafka.transacao.repository;

import org.springframework.data.repository.CrudRepository;
import zup.kafka.transacao.model.EventoDeTransacao;

import java.util.List;

public interface TransacaoRepository extends CrudRepository<EventoDeTransacao, String> {
    List<EventoDeTransacao> findFirst10ByCartaoIdOrderByEfetivadaEmDesc(String cartaoId);
}
