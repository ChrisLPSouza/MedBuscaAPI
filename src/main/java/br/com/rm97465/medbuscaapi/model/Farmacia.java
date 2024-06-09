package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_med_farmacia")
public class Farmacia {
    @Id
    @SequenceGenerator(name = "farmacia", sequenceName = "farmacia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmacia")
    @Column(name = "cd_farmacia")
    private Integer id;
    @Column(name = "nm_farmacia", nullable = false)
    private String nome;
    @Column(name = "ds_endereco", nullable = false)
    private String endereco;
    @Column(name = "ds_descricao", nullable = false)
    private String descricao;

    @ManyToMany
    @JoinTable(name = "tb_medicamentos_farmacia",
            joinColumns = @JoinColumn(name = "cd_farmacia", referencedColumnName = "cd_farmacia"),
            inverseJoinColumns =
            @JoinColumn(name = "cd_medicamento", referencedColumnName = "cd_medicamento"))
    List<Medicamento> listMedicamentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Medicamento> getListMedicamentos() {
        return listMedicamentos;
    }

    public void setListMedicamentos(List<Medicamento> listMedicamentos) {
        this.listMedicamentos = listMedicamentos;
    }
}
