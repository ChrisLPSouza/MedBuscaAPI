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
    public Usuario cadastraUsuario(Usuario usuario) {
        Usuario exists = usuarioRepository.findUsuarioByEmail(usuario.getEmail());
        if(exists == null) {
            if(usuario.getEmail() != null && ! usuario.getEmail().isEmpty()) {
                Usuario user = new Usuario();
                user.setId(0);
                user.setEmail(usuario.getEmail().trim());
                user.setSenha(usuario.getSenha().trim());
                return usuarioRepository.save(user);
            }
        }
        return null;
    }

    @Transactional
    public List<Usuario> listaUsuarios() {
        return this.usuarioRepository.findAll();
    }

    @Transactional
    public Usuario doLogin(Usuario usuario){
       Usuario user =  this.usuarioRepository.findByEmailAndSenha(usuario.getEmail().trim(), usuario.getSenha().trim());
        if (user != null){
            return user;
        }
        return null;
    }
}
