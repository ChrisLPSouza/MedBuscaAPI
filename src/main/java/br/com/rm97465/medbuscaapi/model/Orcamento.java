package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "tb_obra_orcamento")
public class Orcamento {
    @Id
    @SequenceGenerator(name = "orcamento", sequenceName = "sq_tb_obra_orcamento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orcamento")
    @Column(name = "cd_orcamento")
    private Integer id;
    @Column(name = "vl_total", nullable = false)
    private int valor;
    @Column(name = "dt_prazo", nullable = false)
    private Calendar prazo;
    @Column(name = "vl_desconto")
    private int desconto;
    @Column(name = "cd_cliente", nullable = false)
    private int idCliente;
    @Column(name = "cd_empreiteira", nullable = false)
    private int idEmpreiteira;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Calendar getPrazo() {
        return prazo;
    }

    public void setPrazo(Calendar prazo) {
        this.prazo = prazo;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpreiteira() {
        return idEmpreiteira;
    }

    public void setIdEmpreiteira(int idEmpreiteira) {
        this.idEmpreiteira = idEmpreiteira;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "id=" + id +
                ", valor=" + valor +
                ", prazo=" + prazo +
                ", desconto=" + desconto +
                ", idCliente=" + idCliente +
                ", idEmpreiteira=" + idEmpreiteira +
                '}';
    }
}