/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Amala25
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=2*(5-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                   System.out.print("*"+" ");
                   
            }
            for(int m=1;m<i;m++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();   
        }
        
        }
        
    }
}
