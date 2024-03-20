package br.com.rm97465.medbuscaapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_med_usuario")
public class Usuario {
    @Id
    @SequenceGenerator(name = "usuario", sequenceName = "sq_tb_med_usuario", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    @Column(name = "cd_usuario")
    private Integer id;

    @Column(name = "ds_email", nullable = false)
    private String email;

    @Column(name = "ds_senha", nullable = false)
    private String senha;

    @Column(name = "foi_registrado", nullable = false)
    private boolean usuarioCriado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public boolean isUsuarioCriado() {
        return usuarioCriado;
    }

    public void setUsuarioCriado(boolean usuarioCriado) {
        this.usuarioCriado = usuarioCriado;
    }

    public Usuario usuarioCriado(boolean usuarioCriado) {
        this.usuarioCriado = usuarioCriado;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return usuarioCriado == usuario.usuarioCriado &&
                Objects.equals(id, usuario.id) &&
                Objects.equals(email, usuario.email) &&
                Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, senha, usuarioCriado);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", usuarioCriado=" + usuarioCriado +
                '}';
    }
}