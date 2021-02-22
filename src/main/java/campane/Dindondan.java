/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campane;

/**
 *
 * @author Melone
 */
public class Dindondan {
    public static void main (String args[]) throws InterruptedException
    {
        Runnable cam1=new Campana ("din",5);
        Thread thr1=new Thread(cam1);
        thr1.start();
        
        thr1.sleep(10);
        
        Thread thr2=new Thread (new Campana("don",5));
        thr2.start();
        
        thr2.sleep(15);
        
        Thread thr3=new Thread (new Campana("dan",5));
        thr3.start();
        thr3.sleep(25);
        
    }
}
