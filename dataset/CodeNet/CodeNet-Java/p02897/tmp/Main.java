import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double n = sc.nextDouble();
System.out.println("[INST]7;n;sc.nextDouble();"+n);

    double odd = 0;
    double notOdd = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        notOdd++;
      } else {
        odd++;
      }
    }
    System.out.println(odd / n);
  }
}
