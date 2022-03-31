package fr.kb.aaw.mpa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Injectez (inject) via application.properties.
    @Value("${welcome.message}")
    private String message;
    @Value("${author.message}")
    private String author;
    @Value("${curse.message}")
    private String curse;
    @Value("${title.message}")
    private String title;

    @Value("${error.message}")
    private String errorMessage;

    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {

        model.addAttribute("message", message);
        model.addAttribute("author", author);
        model.addAttribute("curse", curse);
        model.addAttribute("title", title);

        return "index";
    }


}
