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
public class ServiceEmailHandler extends AbstractEmailHandler{

    @Override
    public String[] matchingWords() {
        return new String[] { "service", "repair" };
    }

    @Override
    public void handleHere(String email) {
        System.out.println("Email handled by service department.");
    }
       
}
