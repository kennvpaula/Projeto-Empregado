/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoempregado;

/**
 *
 * @author kenne
 */
public class Empregado {
    
    private String nome;
    private String sobrenome;
    private double SalarioAnual;

    public Empregado(String nome, String sobrenome, double SalarioAnual) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.SalarioAnual = SalarioAnual;
    }
    
    public void SalarioAnualComAumento(){
       this.SalarioAnual = this.SalarioAnual + (this.SalarioAnual*10)/100;
        System.out.println("O salario anual com aumento e igual a " + this.SalarioAnual);
       
           
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioAnual() {
        return SalarioAnual;
    }

    public void setSalarioAnual(double SalarioAnual) {
        this.SalarioAnual = SalarioAnual;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", SalarioAnual=" + SalarioAnual + '}';
    }
    
    
    
    
}
