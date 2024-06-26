package br.com.rm97465.medbuscaapi.webservice.controller;

import br.com.rm97465.medbuscaapi.model.Receita;
import br.com.rm97465.medbuscaapi.webservice.services.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/receita")
public class RestReceitaController {
    @Autowired
    private ReceitaService receitaService;

    @GetMapping
    public List<Receita> listReceita() {
        return receitaService.listReceita();
    }
    @PostMapping("cadastra")
    public Receita insertReceita(@RequestBody Receita receita) {
        return receitaService.cadastraReceita(receita);
    }

}
