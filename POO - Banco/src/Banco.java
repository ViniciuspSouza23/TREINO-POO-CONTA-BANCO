//import java.util.Scanner;
public class Banco {
    private String nome;
    private int senha;
    private int saldo;

    public Banco(String nome , int senha , int saldo){
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
            this.nome = nome;
            this.senha = senha;
            this.saldo = saldo;
    }
   public String getNome(){
        return nome;
    }
   public int getSenha(){
        return senha;
    }
  public  int getSaldo(){
        return saldo;
    }
    public void sacar(int valor){
      // Scanner scanner = new Scanner(System.in);
     //  System.out.print("Qual é o valor do Saque: ");
      //  valor = scanner.nextInt();
     // validarSaldo(saldo);
     validarValor(valor);
     if(valor > saldo){
             throw new IllegalArgumentException("Saldo insuficiente!!");
        }
      saldo = saldo - valor;
      //  scanner.close();
    }
    public void depositar(int valor){
       // Scanner scanner = new Scanner(System.in);
      //  System.out.print("Qual é o valor do depósito?: ");
      //  valor = scanner.nextInt();
        validarValor(valor);
          saldo = saldo + valor;
         // scanner.close();
    }
    public void validarValor(int valor){
        if(valor <= 0){
              throw new IllegalArgumentException("Digite um novo valor!!");
        }
    }
     public boolean senhaCorreta(int tentativa) {
        return senha == tentativa;
   }
   public void autenticar(int tentativa){
     if(!senhaCorreta(tentativa)){
        throw new IllegalArgumentException("Login negado!!");
        }   
        else{
            System.out.println("Login efetuado!!");
        }
   }
}
