/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.cadeiaresponsabilidade.cdp;

/**
 *
 * @author 20122bsi0387
 */
public abstract class AbstractEmailHandler implements EmailHandler {
    public EmailHandler nextHandler;

    
    @Override
    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;        
    }
    @Override
    public void processHandler(String email) {
        boolean wordFound = false;
        String[] match = matchingWords();
        if(match.length == 0) {
            wordFound = true;            
        } else {
            for(String word: match) {
                if(email.indexOf(word) >= 0) {
                    wordFound = true;
                    break;
                }
                
            }                       
        }
        
        if(wordFound) {
            handleHere(email);            
        } else {
            nextHandler.processHandler(email);
        }
        
        
    }
    
    public abstract String[] matchingWords(); 
    public abstract void handleHere(String email);

}
