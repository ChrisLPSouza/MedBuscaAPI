package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_med_medicamento")
public class Medicamento {
    @Id
    @SequenceGenerator(name = "medicamento", sequenceName = "sq_tb_med_medicamento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicamento")
    @Column(name = "cd_medicamento")
    private Integer id;
    @Column(name = "nm_medicamento", nullable = false)
    private String medicamento;

   /* @ManyToMany(mappedBy = "listMedicamentos")
    List<Farmacia> listFarmacias;*/
    /*@ManyToMany
    @JoinTable(
            name = "farmacias_medicamento",
            joinColumns = @JoinColumn(name = "medicamento_id"))
    List<Farmacia> listFarmacias;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
}
