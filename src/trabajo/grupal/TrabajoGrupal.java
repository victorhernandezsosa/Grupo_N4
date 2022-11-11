
package trabajo.grupal;

import Helpers.Doctor;
import Helpers.Deportista;


public class TrabajoGrupal {


    public static void main(String[] args) {
      
        
        System.out.println("Doctor");
        System.out.println(" ");
        
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista();
        
        doctor.imprimirInfo();
        
        System.out.println(" ");
        System.out.println("Deportista");
        System.out.println(" ");
        
        deportista.imprimirInfo();
        
    }
    
}
