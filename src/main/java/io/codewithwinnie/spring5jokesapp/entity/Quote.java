package io.codewithwinnie.spring5jokesapp.entity;

import java.util.StringJoiner;

/**
 * Created by
 * @author Ifeanyichukwu Otiwa
 * 5/2/2022 
 */
 
public class Quote {
    private String quotes;
    
    public String getQuotes() {
        return quotes;
    }
    
    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Quote quote1 = (Quote) o;
    
        return getQuotes() != null ? getQuotes().equals(quote1.getQuotes()) : quote1.getQuotes() == null;
    }
    
    @Override
    public int hashCode() {
        return getQuotes() != null ? getQuotes().hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", Quote.class.getSimpleName() + "[", "]")
                .add("quotes='" + quotes + "'")
                .toString();
    }
}
