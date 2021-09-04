package zup.kafka.transacao.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Cartao {
    @NotBlank
    @Column(name = "cartao_id")
    private String id;
    @NotBlank
    @Column(name = "cartao_email")
    private String email;
}
