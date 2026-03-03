package controller;

public class OperaçoesController {
    public OperaçoesController() { super(); }

    // Exercício 1
    public void tempovetor(int tamanho) {
        int[] vetor = new int[tamanho];
        double tempoInicial = System.nanoTime();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0;
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
        System.out.println("Vetor " + tamanho + " posições: " + tempoTotal + " s.");
    }

    // Exercício 2
    public void divideTexto(String texto) {
        String[] partes = texto.split(";");
        System.out.println("Quantidade de partes: " + partes.length);
    }

    // Exercício 3
    public void percorrevetor(int[] vetor) {
        for (int i : vetor) {
            if (i % 2 != 0) {
                System.out.println(i + " - é ímpar");
            } else if (i % 10 == 0) {
                System.out.println(i + " - é par e múltiplo de 10");
            }
        }
    }
}