import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Banco c1 = new Banco("Vinícius" , 9988 , 120);
   System.out.println("Nome: "+c1.getNome()); 
   //System.out.println("Senha: "+c1.getSenha());
   c1.autenticar(9988);
   //c1.Depositar(100);
   //System.out.println("R$: "+ c1.getSaldo());
   Scanner in = new Scanner(System.in);
   System.out.print("Insira o valor do saque: ");
   int  valor = in.nextInt();
   try{
    c1.sacar(valor);
     System.out.println("R$: "+ c1.getSaldo());
   }
    catch(IllegalArgumentException e){
         System.out.println("Erro: " + e.getMessage());
    }
  in.close();
    }
}
