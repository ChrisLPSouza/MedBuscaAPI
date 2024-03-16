package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_obra_cliente_pf")
public class ClientePF extends Cliente{
//
    @Column(name = "nr_cpf", length = 11, nullable = false)
    private String numCpf;
    public String getNumCpf() {
        return numCpf;
    }
    public void setNumCpf(String numCpf) {
        this.numCpf = numCpf;
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "nome=" + getNome() +
                "numCpf='" + numCpf + '\'' +
                '}';
    }
}