/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram.EXthree;

/**
 *
 * @author ELCOT
 */
public class counterfn {
    
    public static void main(String[] args)
    {
        
        counter obj=new counter();
        obj.staticno();
       // c.nonstatic();
        
        counter obj1=new counter();
        obj1.staticno();
        //c.nonstatic();
        
        counter obj2=new counter();
        obj2.staticno();
        obj.nonstatic();
        obj.nonstatic();
        obj.nonstatic();
      //  c.nonstatic();
        
    }
}




class counter
{
    static int a=10;
    int b=20;
    int i=30,j=40;
   
  
    void staticno()
    {
        a=a+10;
        b=b+10;
        System.out.println("\nINCREMENT OF STATIC NUMBER:\n"+a);
         System.out.println(b);
    }
    void nonstatic()
    {
        i=i+10;
        j=j+10;
        System.out.println("\nINCREMENT OF NON-STATIC NUMBER:\n"+i);
         System.out.println(j);
    }
}