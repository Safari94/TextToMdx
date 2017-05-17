package Tokenizer;
import java.util.*;
import java.util.regex.Matcher;
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
public class Tokenizer {
    
    private ArrayList<TokenData> tokenDatas;
    private String str;
    private Token lastToken;
    private boolean pushback;
    
    public Tokenizer(String str){
        this.str=str;
        this.tokenDatas= new ArrayList<TokenData>();
        tokenDatas.add(new TokenData(Pattern.compile("[^Cubo ][A-Za-z ]*[^.]"), TokenType.NCUBO));
        tokenDatas.add(new TokenData(Pattern.compile("[^Eixo ][0-9 ,a-zA-zã]*[^.]"), TokenType.INFOEIXO));
        tokenDatas.add(new TokenData(Pattern.compile("[^Onde ][0-9 ,a-zA-zã]*[^.]"),TokenType.INFOONDE));
    }
    
    public Token nextToken(){
        
        str=str.trim();
        if(pushback){
            pushback=false;
            return lastToken;
        }
        if(str.isEmpty()){
            return (lastToken = new Token("",TokenType.EMPTY));
        }
        for(TokenData data:this.tokenDatas){
            Matcher matcher = data.getPattern().matcher(str);
            
            if(matcher.find()){
                String token = matcher.group().trim();
                str=matcher.replaceFirst("");
                
                return (lastToken=new Token(token,data.getType()));
                
                
            
            
            
            
            }
            
            
        
        }
        throw new IllegalStateException("Could not parse"+str);
        
        }
    
    public boolean hasNextToken(){
        return !str.isEmpty();
    }
    
    public void pushBack(){
    if(lastToken != null){
        this.pushback=true;
    }
    }
    
    }
    
    

