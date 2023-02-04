/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo01;

/**
 *
 * @author Luciano Martinez
 */
public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Enterrando Osso.");
    }
    public void abanarRabo(){
        System.out.println("Abanando o Rabo. ");
    }
    @Override
    public void locomover(){
        System.out.println("Andando.");
    }
    @Override
    public void emitirSom(){
        System.out.println("Latindo.");
    }
    
}
