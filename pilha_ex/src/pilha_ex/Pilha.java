package pilha_ex;

class Pilha { //class Pilha<T>
    private No topo = null; //No<T>

    public void empilhar(Site site) { //T dado
        No novoNo = new No(site); 
        novoNo.proximo = topo;    // O novo segura o que era o topo [cite: 115]
        topo = novoNo;            // O novo vira o topo oficial [cite: 116]
    }

    public Site desempilhar() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        Site valor = topo.dado;   // Salva o site que está saindo [cite: 122]
        topo = topo.proximo;      // O topo desce para o próximo nó [cite: 124]
        return valor;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public Site espiar() {
        if (estaVazia()) return null;
        return topo.dado;
    }
}