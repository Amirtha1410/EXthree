/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram.EXthree;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class sigmoid {
    public static void main(String[] args)
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter a double value:");
     double x=obj.nextDouble();
     sigmoid1.sigmoid(x);   
    }
}






class sigmoid1
{
    static double x;
    static double e;
    static double a;
    static double b;
    
   static void sigmoid(double x)
    {
        e=2.718;
        b=(Math.pow(e,-x));
        a=1/(1-b);
        System.out.println(a);
    }
   
}