package br.com.rm97465.medbuscaapi.controller;

import br.com.rm97465.medbuscaapi.model.Farmacia;
import br.com.rm97465.medbuscaapi.webservice.services.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("farmacias")
public class FarmaciaController {

    @Autowired
    private FarmaciaService farmaciaService;

    @GetMapping
    public String searchResults(@Param("nomeMedicamento") String nomeMedicamento, Model model) {
        List<Farmacia> farmacias = farmaciaService.listFarmaciaByMedicamento(nomeMedicamento.toLowerCase());
        model.addAttribute("medicamento", nomeMedicamento);
        model.addAttribute("farmacias", farmacias);
        return "searchFarmacias";
    }
}
