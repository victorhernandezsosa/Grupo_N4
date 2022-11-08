/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
         System.out.println(Edad);
         System.out.println(Nombre);
         System.out.println(Apellido);
         System.out.println(Genero);
     }
     
     
     
}


