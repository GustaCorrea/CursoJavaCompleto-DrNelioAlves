package pilha_ex;

class Site {
    String nome;
    String url;

    public Site(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    @Override
    public String toString() {
        return nome + " (" + url + ")";
    }
}
