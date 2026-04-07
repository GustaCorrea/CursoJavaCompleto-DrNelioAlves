package pilha_ex;

public class Ordenacao {
	public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        int temp = 0;

        // Loop externo: controla quantas passagens faremos
        for (int i = 0; i < n; i++) {
            
            // Loop interno: faz as comparações par a par
            // O "n - i - 1" é um truque para não olhar o que já está ordenado no final
            for (int j = 1; j < (n - i); j++) {
                
                // Se o elemento da esquerda (j-1) for maior que o da direita (j)
                if (vetor[j - 1] > vetor[j]) {
                    
                    // TROCA (Swap) usando uma variável auxiliar
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};

        System.out.println("Antes do Bubble Sort:");
        imprimirVetor(numeros);

        bubbleSort(numeros);

        System.out.println("\nDepois do Bubble Sort:");
        imprimirVetor(numeros);
    }

    public static void imprimirVetor(int[] v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
