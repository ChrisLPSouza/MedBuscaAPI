package br.com.rm97465.medbuscaapi.webservice.services;

import br.com.rm97465.medbuscaapi.model.Receita;
import br.com.rm97465.medbuscaapi.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private final ReceitaRepository receitaRepository;

    public ReceitaService (ReceitaRepository receitaRepository){
        this.receitaRepository = receitaRepository;

    }
    @Transactional
    public Receita cadastraReceita (Receita receita){
        return receitaRepository.save(receita);
    }
    @Transactional
    public List<Receita> listReceita(){
        return receitaRepository.findAll();
    }
}
