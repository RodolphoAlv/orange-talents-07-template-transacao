package zup.kafka.transacao.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import zup.kafka.transacao.model.EventoDeTransacao;
import zup.kafka.transacao.repository.TransacaoRepository;

@Component
public class ListenerDeTransacao {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {
        transacaoRepository.save(eventoDeTransacao);
    }

}