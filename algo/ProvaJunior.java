package algo;
import algo.poo.Prova;

public class ProvaJunior extends Prova {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public ProvaJunior(String nome, int idade, String email) {
        super(nome, idade);

    }
    public void metodo() {
        System.out.println("Olá, hoje é prova!!");
      
    }
    public void metodo(int idade) {
        System.out.println("Olá : " + idade);
      
    }
    }
   
    
