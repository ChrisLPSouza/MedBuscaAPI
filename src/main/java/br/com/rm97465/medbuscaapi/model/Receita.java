package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_med_receita")
public class Receita {
    @Id
    @SequenceGenerator(name = "receita", sequenceName = "sq_tb_med_receita", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "receita")
    @Column(name = "cd_receita")
    private Integer id;
    @Column(name = "nm_receita", nullable = false)
    private String receita;
    @Column(name = "ds_medicamento", nullable = false)
    private String medicamento;
    @Column(name = "data", nullable = false)
    private String data;
    @Column(name = "ds_posologia", nullable = false)
    private String posologia;
    @Column(name = "e_usocontinuo", nullable = false)
    private Boolean usoContinuo;

    public Receita() {
        this.usoContinuo = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public Boolean getUsoContinuo() {
        return usoContinuo;
    }

    public void setUsoContinuo(Boolean usoContinuo) {
        this.usoContinuo = usoContinuo;
    }
}
