package zup.kafka.transacao.repository;

import org.springframework.data.repository.CrudRepository;
import zup.kafka.transacao.model.EventoDeTransacao;

public interface TransacaoRepository extends CrudRepository<EventoDeTransacao, String> {
}
