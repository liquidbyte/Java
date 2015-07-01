/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial26;

/**
 * Multi Dimensional array with examples
 * @author liquidbyte
 */
public class Array {
    
    public static void main(String args[])
    {
        int firstarray[][] ={{1,2,3,4},{5,7,8},{9,10,11,12,13}};
        
        System.out.println("The values in array are:");
        display(firstarray);
        
    }
    
    public static void display(int x[][])
    {
        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++)
            {
                System.out.print(x[row][column]+" ");
            }
            System.out.println();
        }
    }
    
}
