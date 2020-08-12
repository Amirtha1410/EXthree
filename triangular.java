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
public class triangular {
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    
    System.err.println("Enter three numbers:");
    double a=obj.nextDouble();
    double b=obj.nextDouble();
    double c=obj.nextDouble();
    aretriangular obj1=new aretriangular();
    System.out.println(obj1.aretriangular(a,b,c));
    
    
  }
}


class aretriangular
{
   double a,b,c;
    
  boolean aretriangular(double a,double b,double c)
  {
      if(a>=(b+c) || b>=(a+c) || c>=(a+b))
      {
          
            return false;  
      }
      else
      {
          return true;
      }
  }
}