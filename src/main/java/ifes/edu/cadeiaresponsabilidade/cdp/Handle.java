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
public class Handle {
    public static void handle(String email) {
        EmailHandler spam = new SpamEmailHandler();
        EmailHandler sales = new SalesEmailHandler();
        EmailHandler service = new ServiceEmailHandler();
        EmailHandler manager = new ManageEmailHandler();
        EmailHandler general = new GeneralEmailHandler();
        
        spam.setNextHandler(sales);
        sales.setNextHandler(service);
        service.setNextHandler(manager);
        manager.setNextHandler(general);
        spam.processHandler(email);
    }
}
