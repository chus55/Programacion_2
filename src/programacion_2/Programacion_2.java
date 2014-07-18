/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programacion_2;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Jesus
 */
public class Programacion_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Date y calender
       Date antes = new Date(100);
       Date ahora = new Date();
       System.out.println(ahora);
       System.out.println("Mili de ahora: "+ahora.getTime());
            
       if(ahora.getTime() > antes.getTime())
           System.out.println("Ok ahora paso despues que antes");
       if(ahora.after(antes))
           System.out.println("Ok ahora paso despues que antes");
       if(antes.before(ahora))
           System.out.println("Ok antes paso antes que despues");
       
       //ArrayList
       ArrayList<String> cadenas = new ArrayList<>();
       cadenas.add("Jesus");
       cadenas.add("Carlos");
       cadenas.add("Luis");
        System.out.println(cadenas.get(0));
       System.out.println("size of array = " + cadenas.size());
       
      // cadenas.remove(1);
       //cadenas.clear();
       
       if(cadenas.contains("Jesus"))
            System.out.println("Si esta");
               
       for(int x=0; x<cadenas.size();x++)
           System.out.println(cadenas.get(x));
       
       for(String c: cadenas)
           System.out.println(c);
       
       //Test para programa de github
       
    }
    
}
