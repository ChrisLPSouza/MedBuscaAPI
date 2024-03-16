package br.com.rm97465.medbuscaapi.webservice.controller;

import br.com.rm97465.medbuscaapi.model.Emp;
import br.com.rm97465.medbuscaapi.webservice.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/empreiteira")
public class EmpController {
    @Autowired
    private EmpService empreiteiraService;

    @GetMapping
    public List<Emp> listEmpreiteira(){
        return empreiteiraService.listaEmpreiteira();
    }

    @PostMapping("cadastra")
    public String insertEmpreiteira(@RequestBody Emp empreiteira){
        return empreiteiraService.cadastraEmpreiteira(empreiteira);
    }
    @PutMapping("atualiza")
    public String updateEmpreiteira(@RequestBody Emp empreiteira) {
        return empreiteiraService.atualizaEmpreiteira(empreiteira);
    }

    @DeleteMapping("deleta/{id}")
    public ResponseEntity deleteEmpreiteira(@PathVariable Integer id) {
        return empreiteiraService.deletaEmpreiteiraPorId(id);
    }
}
