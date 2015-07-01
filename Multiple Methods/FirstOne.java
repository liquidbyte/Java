/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;


import java.util.Scanner ;
public class FirstOne{
    public static void main(String[] args) {
    SecondOne newObject = new SecondOne();
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name:");
    String name = input.nextLine();
    newObject.setName(name);
    newObject.saying();
    }
}