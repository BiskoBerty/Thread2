/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author galimberti.riccardoe
 */
public class Kebab implements Runnable{

    private boolean stop = false;
    
    @Override
    public void run() {
        long ris = 6;
        long i = ris;
        while(!stop){
            long b = ris;
            i--;
            ris = ris * i;
            System.out.println("                " + b + "*" + i +" = " + ris);
            try{
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Kebab.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i == 1)
                stop();
        }
    }
    
    public void stop(){
        stop = true;
    }
    
}
