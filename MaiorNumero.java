import java.util.Scanner;
    public class MaiorNumero {
      public static void main(String args[]) {
            int n;
            int m;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o primeiro numero: ");
            try
            {
             n = leitor.nextInt();
            }
            catch (java.util.InputMismatchException e)
            {
                System.out.println("Numero Invalido");
                //
                return;
            }
            System.out.println("Digite o segundo numero: ");
            try
            {
             m = leitor.nextInt();
            }
            catch (java.util.InputMismatchException e)
            {
                System.out.println("Numero Invalido");
                //
                return;
            }
            leitor.close();
        if(n > m) {
           System.out.println("O primeiro numero e maior");
        }
        else if(m > n) {
           System.out.println("O segundo numero e maior");
         }
          else {
          System.out.println("Os numeros sao iguais");
          }
      }
    }
