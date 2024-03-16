package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

@Entity
@Table(name="tb_obra_empreiteira")
public class Emp {
    @Id
    @SequenceGenerator(name = "empreiteira", sequenceName = "sq_tb_obra_empreiteira", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empreiteira")
    @Column(name = "cd_empreiteira")
    private Integer id;
    @Column(name = "nm_empreiteira", length = 100, nullable = false)
    private String nome;
    @Column(name = "nr_cpf")
    private int cpf;
    @Column(name = "nr_cnpj")
    private int cnpj;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empreiteira{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", cnpj=" + cnpj +
                '}';
    }
}