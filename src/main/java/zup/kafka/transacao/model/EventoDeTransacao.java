package zup.kafka.transacao.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EventoDeTransacao {
    @Id
    @NotBlank
    private String id;
    @NotNull
    @Positive
    private BigDecimal valor;
    @NotNull
    @Embedded
    private Estabelecimento estabelecimento;
    @NotNull
    @Embedded
    private Cartao cartao;
    private LocalDateTime efetivadaEm;
}
