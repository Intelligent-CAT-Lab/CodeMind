import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0, z=0;
      int sum = 0;
      try {
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
         y = scanner.nextInt();
         z = scanner.nextInt();
         scanner.close();
      } catch (InputMismatchException e) {
         System.out.println("error");
      }
      for (int i=x; i<z+1; i=i+x) {
         sum = sum+y;
      }
      System.out.println(sum);
   }
}
