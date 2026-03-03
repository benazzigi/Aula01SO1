package view;

import javax.swing.JOptionPane;
import controller.OperaçoesController;

public class Principal {
    public static void main(String[] args) {
        OperaçoesController op = new OperaçoesController();

        // Exercício 1
        System.out.println("--- RESULTADO EXERCÍCIO 1 ---");
        op.tempovetor(1000);
        op.tempovetor(10000);
        op.tempovetor(100000);

        // Exercício 2
        System.out.println("\n--- RESULTADO EXERCÍCIO 2 ---");
        // Teste com os textos
        String textoEntrada = JOptionPane.showInputDialog("Entre com o texto:");
        op.divideTexto(textoEntrada);

        // Exercício 3
        System.out.println("\n--- RESULTADO EXERCÍCIO 3 ---");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Tamanho (n) limite 100:"));
        if (n > 100) n = 100;
        
        int[] vetInteiros = new int[n];
        for (int i = 0; i < n; i++) {
            vetInteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor " + (i+1)));
        }
        op.percorrevetor(vetInteiros);
    }
}