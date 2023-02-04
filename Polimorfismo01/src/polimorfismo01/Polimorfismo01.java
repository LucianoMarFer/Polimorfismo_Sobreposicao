/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo01;

/**
 *
 * @author Luciano Martinez
 */
public class Polimorfismo01 { // polimorfismo de sobreposição

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.setPeso(5.7f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("----------------------------");
        
        c.setPeso(55.3f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("----------------------------");

        
        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("----------------------------");
        
        
        //System.out.println("hello world");
//        Mamifero m = new Mamifero();
//        Reptil n = new Reptil();
//        Peixe p = new Peixe();
//        Ave v = new Ave();
//        
//        
//        m.setPeso(85.3f);
//        m.setMembros(4);
//        m.setIdade(3);
//        m.setCorPelo("Marrom");
//        m.status();
//        m.locomover();
//        p.locomover();
//        n.status();
//        v.fazerNinho();
////        n.alimentar();
////        p.alimentar();
////        v.alimentar();
//        
    }
    
}
