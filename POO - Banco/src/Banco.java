import java.util.Scanner;
public class Banco {
    public String nome;
    public int senha;
    public int saldo;

    public Banco(String nome , int senha , int saldo){
            this.nome = nome;
            this.senha = senha;
            this.saldo = saldo;
    }
    String getNome(){
        return nome;
    }
    int getSenha(){
        return senha;
    }
    int getSaldo(){
        return saldo;
    }
    public void Sacar(int valor){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Qual é o valor do Saque: ");
        valor = scanner.nextInt();
        saldo = saldo - valor;
        scanner.close();
    }
}
