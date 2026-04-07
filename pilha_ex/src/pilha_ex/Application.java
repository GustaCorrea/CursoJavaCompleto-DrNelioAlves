package pilha_ex;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    	Pilha historico = new Pilha(); //Pilha<Site> historico = new Pilha<>();
        Scanner sc = new Scanner(System.in);

        // Simulando a navegação
        historico.empilhar(new Site("Google", "google.com"));
        historico.empilhar(new Site("Fatec Itu", "fatecitu.edu.br"));
        historico.empilhar(new Site("GitHub", "github.com"));

        while (!historico.estaVazia()) {
            System.out.println("\n--- NAVEGADOR ---");
            System.out.println("Atual: " + historico.espiar());
            System.out.print("Voltar (v) ou Sair (s)? ");
            
            String opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("v")) {
                System.out.println("Saindo de: " + historico.desempilhar());
            } else {
                break;
            }
        }
        System.out.println("Fim da navegação.");
        sc.close();
    }
}
