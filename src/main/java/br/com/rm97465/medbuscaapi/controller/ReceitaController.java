package br.com.rm97465.medbuscaapi.controller;

import br.com.rm97465.medbuscaapi.model.Receita;
import br.com.rm97465.medbuscaapi.webservice.services.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("receita")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping("listar")
    public String list(Model model) {

        model.addAttribute("minhasReceitas", receitaService.listReceita());
        return "home";
    }

    @GetMapping("open-form")
    public String openForm(Model model) {

        model.addAttribute("newReceita", new Receita());

        return "receita/cadastra";
    }

    @PostMapping("submit-form")
    public String submitForm(@ModelAttribute Receita receita, Model model, RedirectAttributes redirect) {

        receitaService.cadastraReceita(receita);

        redirect.addFlashAttribute("msg", receita.getNome().toUpperCase() + ",\ncadastrado com sucesso");
        return "redirect:listar";
    }
}
