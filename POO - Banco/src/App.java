//import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Banco c1 = new Banco("Vinícius" , 9913 , 900);
   System.out.println("Nome: "+c1.getNome()); 
   System.out.println("Senha: "+c1.getSenha());
   c1.Sacar(200);
   System.out.println("R$: "+ c1.getSaldo());
    }
}
