/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo01;

/**
 *
 * @author Luciano Martinez
 */
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
        System.out.println("O animal e uma  AVE .");
        System.out.println("Possui " + this.getMembros() + " patas, " + this.getIdade() + " anos, " + this.getPeso() + " quilos e possui penas da cor " + this.getCorPena() + " . ");
        System.out.println("------------------------------------------");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }    
}
