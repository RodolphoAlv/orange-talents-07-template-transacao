package zup.kafka.transacao.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Estabelecimento {
    @NotBlank
    @Column(name = "estabelecimento_nome")
    private String nome;
    @Column(name = "estabelecimento_cidade")
    private String cidade;
    @Column(name = "estabelecimento_endereco")
    private String endereco;
}
