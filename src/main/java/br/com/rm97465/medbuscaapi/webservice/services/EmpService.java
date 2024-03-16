package br.com.rm97465.medbuscaapi.webservice.services;

import br.com.rm97465.medbuscaapi.model.Emp;
import br.com.rm97465.medbuscaapi.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    private final EmpRepository empreiteiraRepository;

    public EmpService(EmpRepository empreiteiraRepository) {
        this.empreiteiraRepository = empreiteiraRepository;
    }

    @Transactional
    public String cadastraEmpreiteira(Emp empreiteira) {
        String mensagem = "";
        if(this.empreiteiraRepository.findById(empreiteira.getId()).isPresent()){
            mensagem = "Já existe uma empreiteira com esse número de id, tente novamente";
        } else {
            this.empreiteiraRepository.save(empreiteira);
            mensagem = "Empreiteira cadastrada com sucesso";
        }
        return mensagem;
    }

    @Transactional
    public String atualizaEmpreiteira(Emp empreiteira){
        String mensagem = "";
        if(this.empreiteiraRepository.findById(empreiteira.getId()).isPresent()){
            this.empreiteiraRepository.save(empreiteira);
            mensagem = "Empreiteira atualizada com sucesso";
        } else {
            mensagem = "Não foi encontrado nenhuma empreiteira com esse número de id, tente novamente";
        }
        return mensagem;
    }

    @Transactional
    public List<Emp> listaEmpreiteira() {
        return this.empreiteiraRepository.findAll();
    }

    @Transactional
    public ResponseEntity<String> deletaEmpreiteiraPorId(Integer id) {
        if (this.empreiteiraRepository.existsById(id)){
            this.empreiteiraRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
