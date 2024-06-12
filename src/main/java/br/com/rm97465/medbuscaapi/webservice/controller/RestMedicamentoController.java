package br.com.rm97465.medbuscaapi.webservice.controller;

import br.com.rm97465.medbuscaapi.model.Medicamento;
import br.com.rm97465.medbuscaapi.webservice.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/medicamentos")
public class RestMedicamentoController {
    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping
    public List<Medicamento> listMedicamento() {
        return medicamentoService.listMedicamento();
    }

    @PostMapping("cadastra")
    public Medicamento insertMedicamento(@RequestBody Medicamento medicamento) {
        return medicamentoService.cadastraMedicamento(medicamento);
    }

}
