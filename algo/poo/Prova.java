package algo.poo;
public class Prova {
    private String nome;
    private int idade;
    public Prova(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Prova(String nome, int idade, String email) {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}