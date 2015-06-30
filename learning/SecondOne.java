/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author viswanathankashi
 */
import java.util.Scanner;
public class SecondOne {

    /**
     * @param args the command line arguments
     */
   private String yourName ;
   public void setName(String a){
       yourName=a;
   }     
   public String returnName(){
       return yourName;
   }
   public void saying(){
       System.out.printf("Your name is: %s", returnName());
   }
}
