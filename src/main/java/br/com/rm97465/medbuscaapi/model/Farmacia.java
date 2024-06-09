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
    private String farmacia;
    @Column(name = "ds_endereco", nullable = false)
    private String endereco;
    @Column(name = "ds_descricao", nullable = false)
    private String descricao;

    /* @ManyToMany(mappedBy = "listFarmacias")
     List<Medicamento> listMedicamentos;*/
    @ManyToMany
    @JoinTable(name = "medicamentos_farmacia")
    List<Farmacia> listMedicamentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(String farmacia) {
        this.farmacia = farmacia;
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

    public List<Farmacia> getListMedicamentos() {
        return listMedicamentos;
    }

    public void setListMedicamentos(List<Farmacia> listMedicamentos) {
        this.listMedicamentos = listMedicamentos;
    }
}
