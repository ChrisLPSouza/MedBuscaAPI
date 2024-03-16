package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_obra_cliente_pj")
public class ClientePJ extends Cliente{

    @Column(name = "nr_cnpj", length = 14, nullable = false)
    private String numCnpj;
    public String getNumCnpj() {
        return numCnpj;
    }
    public void setNumCnpj(String numCnpj) {
        this.numCnpj = numCnpj;
    }

    @Override
    public String toString() {
        return "ClientePJ{" +
                "numCnpj='" + numCnpj + '\'' +
                '}';
    }
}
