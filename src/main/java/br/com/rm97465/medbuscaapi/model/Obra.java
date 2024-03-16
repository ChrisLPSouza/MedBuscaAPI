package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

import java.util.Calendar;

@Entity
@Table(name="tb_obra_obra")
public class Obra {
    @Id
    @SequenceGenerator(name = "obra", sequenceName = "sq_tb_obra_obra", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "obra")
    @Column(name = "cd_obra")
    private Integer id;
    @Column(name = "ds_obra", length = 150, nullable = false)
    private String obra;
    @Column(name = "ds_material", length = 100, nullable = false)
    private String material;
    @Column(name = "dt_inicio", length = 10, nullable = false)
    private Calendar inicio;
    @Column(name = "dt_fim", length = 10, nullable = false)
    private Calendar fim;
    @Column(name = "cd_orcamento", nullable = false)
    private int idOrcamento;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getObra() {
        return obra;
    }
    public void setObra(String obra) {
        this.obra = obra;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Calendar getInicio() {
        return inicio;
    }
    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }
    public Calendar getFim() {
        return fim;
    }
    public void setFim(Calendar fim) {
        this.fim = fim;
    }
    public int getIdOrcamento() {
        return idOrcamento;
    }
    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "id=" + id +
                ", obra='" + obra + '\'' +
                ", material='" + material + '\'' +
                ", inicio=" + inicio +
                ", fim=" + fim +
                ", idOrcamento=" + idOrcamento +
                '}';
    }
}