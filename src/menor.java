/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class menor {
    static int menorr (int num1,int num2){
        if (num1<num2){
            System.out.print("El menor es: ");
            return num1;}
        else
            if (num2<num1){
                 System.out.print("El menor es: ");
                 return num2;}
            else{
                return 1;}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato= new Scanner(System.in);
        int n1,n2;
        
        System.out.print("Ingrese primer numero: ");
        n1=dato.nextInt();
        
        System.out.print("Ingrese segundo numero: ");
        n2=dato.nextInt();
        
        System.out.print(menorr(n1,n2));
        dato.close();
        
    }
}