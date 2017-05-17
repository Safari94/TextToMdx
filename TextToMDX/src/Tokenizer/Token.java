package Tokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier
 */
public class Token {
    
    private String token;
    private TokenType type;

    public Token(String token, TokenType type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }
    
    
    
}
