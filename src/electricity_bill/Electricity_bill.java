/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_bill;

import javax.swing.WindowConstants;

/**
 *
 * @author mdakr
 */
public class Electricity_bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin adobj=new Admin();
        adobj.setVisible(true);
        adobj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
}
