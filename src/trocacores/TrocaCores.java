/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocacores;

/**
 *
 * @author Noa
 */
public class TrocaCores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        String cores[] = new String[10];
        String aux = "";

        // ler o vetor = encher o vetor com dados
        for (int i = 0; i < 10; i++) {
            cores[i] = Entrada.leiaString("Informe uma cor: " + "(" + i + ")");
        }

        // escrita do vetor
        System.out.println("Cores lidas: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(cores[i] + " ");
        }

        // troca de valores
        for (int i = 0; i < 10; i = i + 2) {
            aux = cores[i];
            cores[i] = cores[i + 1];
            cores[i + 1] = aux;
        }
        
        // escrita do novo vetor
        System.out.println("\nCores trocadas/novas: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(cores[i] + " ");
        }
        
        //JOptionPane.showMessageDialog(null, "colors: " + (Arrays.toString(colors))
        //                               + "\ncolorsChanged: " + (Arrays.toString(colorsChanged)));
        // comando para ter a saida numa segunda tela

        System.exit(0);
    }
    
}
