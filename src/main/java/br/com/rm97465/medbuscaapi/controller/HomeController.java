package br.com.rm97465.medbuscaapi.controller;

import br.com.rm97465.medbuscaapi.model.Receita;
import br.com.rm97465.medbuscaapi.webservice.services.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping("")
    public String home(Model model){
        List<Receita> receitas = receitaService.listReceita();
        model.addAttribute("minhasReceitas", receitas);
        return "home";
    }

}
