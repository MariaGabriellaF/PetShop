public class Animal {
    private String nome;
    private String tamanho;
    private String tamanhoDoPelo;

    public Animal(String nome, String tamanho, String tamanhoDoPelo) {
        this.nome = nome;
        this.tamanho = tamanho.toLowerCase();
        this.tamanhoDoPelo = tamanhoDoPelo.toLowerCase();
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTamanhoDoPelo() {
        return tamanhoDoPelo;
    }
    public void animalTosado(){
        tamanhoDoPelo= "curto";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", tamanhoDoPelo='" + tamanhoDoPelo + '\'' +
                '}';
    }
}
