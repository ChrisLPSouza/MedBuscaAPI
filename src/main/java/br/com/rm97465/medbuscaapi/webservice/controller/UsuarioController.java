package br.com.rm97465.medbuscaapi.webservice.controller;

import br.com.rm97465.medbuscaapi.model.Usuario;
import br.com.rm97465.medbuscaapi.webservice.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    //@Autowired o Spring vai instanciar o repository automaticamente
    @Autowired
    private UsuarioService usuarioService;

    // Usuario é o tipo do retorno
    //insertUsuario é o nome do método
    //() é o parâmetro do tipo Usuario e nome da referência
    @GetMapping
    public List<Usuario> listUsuario() {
        return usuarioService.listaUsuarios();
    }
    @GetMapping("login")
    public Usuario doLogin(@RequestBody Usuario usuario){
        return usuarioService.doLogin(usuario);

    }
    @PostMapping("cadastra")
    public Usuario insertUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastraUsuario(usuario);
    }

}
