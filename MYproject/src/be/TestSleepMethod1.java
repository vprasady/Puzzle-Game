/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

/**
 *
 * @author PrasadYeole
 */
public class TestSleepMethod1 extends Thread{  
 
    
    public void run(){  
  
       
    
      try{
        Thread.sleep(3*1000);
    }
    
    catch(InterruptedException e)
    {
        System.out.println(e);
    }  
      
  }  
   
 public static void main(String args[]){  
  TestSleepMethod1 t1=new TestSleepMethod1();  
   }  
}  