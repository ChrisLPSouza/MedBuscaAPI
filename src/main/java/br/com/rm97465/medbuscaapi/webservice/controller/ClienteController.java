package br.com.rm97465.medbuscaapi.webservice.controller;

import br.com.rm97465.medbuscaapi.model.Cliente;
import br.com.rm97465.medbuscaapi.webservice.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listCliente(){
        return clienteService.listaClientes();
    }
    @PostMapping ("cadastra")
    public String insertCliente(@RequestBody Cliente cliente){
        return clienteService.cadastraCliente(cliente);
    }
    @PutMapping("atualiza")
    public String updateCliente(@RequestBody Cliente cliente){
        return clienteService.atualizaCliente(cliente);
    }
    @DeleteMapping ("deleta/{id}")
    public ResponseEntity deleteCliente (@PathVariable ("id") Integer id){
        return clienteService.deletaClientePorId(id);
    }
}
