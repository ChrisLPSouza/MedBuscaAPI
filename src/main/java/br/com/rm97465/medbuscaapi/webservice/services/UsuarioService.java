package br.com.rm97465.medbuscaapi.webservice.services;

import br.com.rm97465.medbuscaapi.model.Usuario;
import br.com.rm97465.medbuscaapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public String cadastraUsuario(Usuario usuario) {
        String mensagem = "";
        Usuario user = this.usuarioRepository.findUsuarioByEmail(usuario.getEmail());
        if(user != null){
            mensagem = "Usuário já existe!";
        } else {
            if(usuario.getEmail() != null && ! usuario.getEmail().isEmpty()){

                Usuario validUser = new Usuario();
                validUser.setId(0);
                validUser.setEmail(usuario.getEmail().trim());
                validUser.setSenha(usuario.getSenha().trim());
                this.usuarioRepository.save(validUser);
                mensagem = "Usuário cadastrado com sucesso";
            }

        }
        return mensagem;
    }

    @Transactional
    public String atualizaUsuario(Usuario usuario){
        String mensagem = "";
        if(this.usuarioRepository.findById(usuario.getId()).isPresent()){
            this.usuarioRepository.save(usuario);
            mensagem = "Usuário atualizado com sucesso";
        } else {
            mensagem = "Não foi encontrado nenhum usuário com esse número de id, tente novamente";
        }
        return mensagem;
    }

    @Transactional
    public List<Usuario> listaUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuario doLogin(Usuario usuario){

       Usuario user =  this.usuarioRepository.findByEmailAndSenha(usuario.getEmail().trim(), usuario.getSenha().trim());
        if (user != null){
            return user;
        }
        return null;
    }
}
