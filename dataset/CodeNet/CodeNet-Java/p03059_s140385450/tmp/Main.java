import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0, z=0;
      int sum = 0;
      try {
         Scanner scanner = new Scanner(System.in);
         x = scanner.nextInt();
System.out.println("[INST]9;x;scanner.nextInt();"+x);
         y = scanner.nextInt();
System.out.println("[INST]10;y;scanner.nextInt();"+y);
         z = scanner.nextInt();
System.out.println("[INST]11;z;scanner.nextInt();"+z);
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
