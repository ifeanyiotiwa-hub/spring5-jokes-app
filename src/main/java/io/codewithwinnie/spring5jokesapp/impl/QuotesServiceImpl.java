package io.codewithwinnie.spring5jokesapp.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import io.codewithwinnie.spring5jokesapp.entity.Quote;
import io.codewithwinnie.spring5jokesapp.service.QuotesService;
import org.springframework.stereotype.Service;

/**
 * Created by
 * @author Ifeanyichukwu Otiwa
 * 5/2/2022 
 */

@Service
public class QuotesServiceImpl implements QuotesService {
    
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    
    public QuotesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }
    
    @Override
    public Quote getRandomChuckNorrisQuotes() {
        Quote quote = new Quote();
        quote.setQuotes(chuckNorrisQuotes.getRandomQuote());
        return quote;
    }
}
