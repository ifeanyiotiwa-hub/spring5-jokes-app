package io.codewithwinnie.spring5jokesapp.controller;

import io.codewithwinnie.spring5jokesapp.service.QuotesService;
import org.springframework.stereotype.Controller;

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
}
