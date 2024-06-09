package br.com.rm97465.medbuscaapi.controller;

import br.com.rm97465.medbuscaapi.model.Farmacia;
import br.com.rm97465.medbuscaapi.model.Receita;
import br.com.rm97465.medbuscaapi.webservice.services.FarmaciaService;
import br.com.rm97465.medbuscaapi.webservice.services.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ReceitaService receitaService;
    @Autowired
    private FarmaciaService farmaciaService;

    @GetMapping("")
    public String home(Model model) {
        List<Receita> receitas = receitaService.listReceita();
        model.addAttribute("minhasReceitas", receitas);
        return "home";
    }

    @GetMapping("/{nomeMedicamento}")
    @ResponseBody
    public String searchResults(@PathVariable("nomeMedicamento") String nomeMedicamento, Model model) {
        List<Farmacia> farmacias = farmaciaService.listFarmaciaByMedicamento(nomeMedicamento);
        model.addAttribute("farmacias", farmacias);
        return "searchFarmacias";
    }

}
