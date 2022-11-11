
package Helpers;

public class Persona {
     private int Edad;
     private String Nombre;
     private String Apellido;
     private String Genero;
     
     public Persona(){
    
}
     public void setEdad(int _edad){
         this.Edad=_edad;
     }
     
     public void setNombre(String _nombre){
         this.Nombre=_nombre;
     }
     
     public void setApellido(String _apellido){
         this.Apellido=_apellido;
     }
     
     public void setGenero(String _genero){
         this.Genero=_genero;
     }
     
     public int getEdad(){
         return this.Edad;
     }
     
     public String getNombre(){
         return this.Nombre;
     }
     
     public String getApellido(){
         return this.Apellido;
     }
     
     public String getGenero(){
         return this.Genero;
     }
     
     public void imprimirInfo(){
         System.out.println("Edad: "+Edad);
         System.out.println("Nombre: "+Nombre);
         System.out.println("Apellido: "+Apellido);
         System.out.println("Genero: "+Genero);
     }
}


