/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

/**
 * @author Luke Morton
 * @version 16/02/15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date date = new Date();
        Address address1 = new Address("sdlkdsklds@gmail.com");
        
        Customer customer = new Customer(200, "Kdksksa", "fddsds", address1);
        System.out.println(customer);
        
        Visitor visitor = new Visitor(date, "dsdssd", "dsfdfddssd" , address1);
        System.out.println(visitor);
        
    }
    
}
