package pilha_ex;

class No {
    Site dado;   // Agora armazena especificamente um objeto Site
    No proximo;  // Aponta para o próximo Nó

    public No(Site dado) {
        this.dado = dado;
        this.proximo = null; 
    }
}

/*class No<T> {
T dado;
No<T> proximo;

public No(T dado) {
    this.dado = dado;
    this.proximo = null; [cite: 104, 163]
}
}*/
