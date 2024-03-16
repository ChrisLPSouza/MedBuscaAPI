package br.com.rm97465.medbuscaapi.webservice.services;

import br.com.rm97465.medbuscaapi.model.Cliente;
import br.com.rm97465.medbuscaapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public String cadastraCliente(Cliente cliente) {
        String mensagem = "";
        if(this.clienteRepository.findById(cliente.getId()).isPresent()){
            mensagem = "Já existe um cliente com esse número de id, tente novamente";
        } else {
            this.clienteRepository.save(cliente);
            mensagem = "Cliente cadastrado com sucesso";
        }
        return mensagem;
    }

    @Transactional
    public String atualizaCliente(Cliente cliente){
        String mensagem = "";
        if(this.clienteRepository.findById(cliente.getId()).isPresent()){
            this.clienteRepository.save(cliente);
            mensagem = "Cliente atualizado com sucesso";
        } else {
            mensagem = "Não foi encontrado nenhum cliente com esse número de id, tente novamente";
        }
        return mensagem;
    }

    @Transactional
    public List<Cliente> listaClientes() {
        return this.clienteRepository.findAll();
    }

    @Transactional
    public ResponseEntity<String> deletaClientePorId(Integer id) {
        if (this.clienteRepository.existsById(id)){
            this.clienteRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
