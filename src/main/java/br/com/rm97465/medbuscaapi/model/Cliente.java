package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_obra_cliente")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {
    @Id
    @SequenceGenerator(name = "cliente", sequenceName = "sq_tb_obra_cliente", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    @Column(name = "cd_cliente")
    private Integer id;
    @Column(name = "nm_cliente", length = 100, nullable = false)
    private String nome;
    @Column(name = "ds_endereco", length = 100, nullable = false)
    private String endereco;
    @Column(name = "cd_ususario", nullable = false)
    private int idUsuario;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idUsuario=" + idUsuario +
                '}';
    }
}