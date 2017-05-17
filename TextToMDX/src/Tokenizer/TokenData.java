package Tokenizer;

import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier
 */
public class TokenData {
    
    private Pattern pattern;
    private TokenType type;

    public TokenData(Pattern pattern, TokenType type) {
        this.pattern = pattern;
        this.type = type;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }
    
    
    
    
}
