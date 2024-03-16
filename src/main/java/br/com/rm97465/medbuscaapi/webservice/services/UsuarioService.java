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
        if(this.usuarioRepository.findById(usuario.getId()).isPresent()){
            mensagem = "Já existe um usuário com esse número de id, tente novamente";
        } else {
            this.usuarioRepository.save(usuario);
            mensagem = "Usuário cadastrado com sucesso";
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

    @Transactional
    public ResponseEntity<String> deletaUsuarioPorId(Integer id) {
        if (this.usuarioRepository.existsById(id)){
            this.usuarioRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
