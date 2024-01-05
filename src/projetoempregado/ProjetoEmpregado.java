/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoempregado;

/**
 *
 * @author kenne
 */
public class ProjetoEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empregado[] emp = new Empregado[2];
        
        emp[0] = new Empregado("Kennedy", "Vieira", 3000.0);
        emp[1] = new Empregado("Lucas", "Souza", 3500.0);
        
        System.out.println(emp[0].toString());
        emp[0].SalarioAnualComAumento();
        
        
        
        
        
    }
    
}
