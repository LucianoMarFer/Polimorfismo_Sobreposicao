/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo01;

/**
 *
 * @author Luciano Martinez
 */
public class Peixe extends Animal {
    private String corEscama;  
    
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
     public void status(){
        System.out.println("------------------------------------------");
        System.out.println("O animal e um  PEIXE .");
        System.out.println("Possui " + this.getMembros() + " nadadeiras, " + this.getIdade() + " anos, " + this.getPeso() + " quilos e possui escamas da cor " + this.getCorEscama() + " . ");
        System.out.println("------------------------------------------");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo como peixe");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }    
}
