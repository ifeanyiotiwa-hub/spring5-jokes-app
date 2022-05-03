package io.codewithwinnie.spring5jokesapp.controller;

import io.codewithwinnie.spring5jokesapp.service.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by
 * @author Ifeanyichukwu Otiwa
 * 5/2/2022 
 */

@Controller
public class QuoteController {
    
    private final QuotesService quotesService;
    
    public QuoteController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }
    
    @RequestMapping({"/", ""})
    public String showQuote(Model model) {
        model.addAttribute("quote", quotesService.getRandomChuckNorrisQuotes());
        return "chucknorris";
    }
}
