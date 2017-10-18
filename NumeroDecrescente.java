import java.util.Scanner;
    public class NumeroDecrescente {
      public static void main(String args[]) {
            int n;
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
        for (int  i = n; i >= 0 ; i--) {

          System.out.println(Integer.toString(i));
          }

    }
  }
