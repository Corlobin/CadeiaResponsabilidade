/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.cadeiaresponsabilidade.application;

import ifes.edu.cadeiaresponsabilidade.cdp.Handle;

/**
 *
 * @author 20122bsi0387
 */
public class Application {
    public static void main(String args[]) {
        String email = "I want to buy some clothes, please, contact me!";
        Handle.handle(email);
        String email2 = "aumente seu penis em 2 dias";
        Handle.handle(email2);
        
    }
}
