package com.mycompany.acces;

import people.Persona;

public class Acces {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.anyHello();
        
      Persona Persona = new Persona ("Pepito" , "Perez", 15);
        System.out.println(Persona.getFullName());  
        System.out.println(Persona.getAge());  
             
       
    }
}
