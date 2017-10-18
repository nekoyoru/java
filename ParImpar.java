public class ParImpar {
  public static void main(String args[]) {
    Long par = new Long(0);
    Long impar = new Long(1);
    for (int  i = 0; i <= 30; i++) {
      if(i % 2 == 0){
        par = par+i;
    }else{
        impar = impar*i;
    }
      }
      System.out.println("A soma dos numeros pares e " + Long.toString(par));
      System.out.println("A Multiplicacao dos impares e "+ Long.toString(impar));
  }
}
