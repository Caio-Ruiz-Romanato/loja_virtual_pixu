package devpixulojavirtual.loja_pixu_virtual.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa_fisica")
@SequenceGenerator(name = "seq_fisica", sequenceName = "seq_fisica", initialValue = 1, allocationSize = 1)
public class PessoaFisica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
