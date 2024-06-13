package br.com.rm97465.medbuscaapi.webservice.controller;

import br.com.rm97465.medbuscaapi.model.Farmacia;
import br.com.rm97465.medbuscaapi.model.Medicamento;
import br.com.rm97465.medbuscaapi.webservice.services.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/farmacias")
public class RestFarmaciaController {
    @Autowired
    private FarmaciaService farmaciaService;

    @GetMapping
    public List<Farmacia> listFarmacia() {
        return farmaciaService.listFarmacia();
    }

    @PostMapping("cadastra")
    public Farmacia insertFarmacia(@RequestBody Farmacia farmacia) {
        return farmaciaService.cadastraFarmacia(farmacia);
    }

    @PostMapping("cadastraLista")
    public List<Farmacia> insertListaFarmacias(@RequestBody List<Farmacia> farmaciasLista) {
        return farmaciaService.cadastraListaFarmacias(farmaciasLista);
    }

}
