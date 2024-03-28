import java.util.Scanner;

public class p03556 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine().trim());
      int a = (int)Math.sqrt(n);

      System.out.println(a*a);

      scanner.close();
   }
}