import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
System.out.println("[INST]8;N;sc.nextInt();"+N);
    int K = sc.nextInt();
System.out.println("[INST]9;K;sc.nextInt();"+K);

    sc.close();

    if (K % 2 == 0) {
      long c1 = N / K;
      long c2 = N / (K / 2) - c1;
      System.out.println(c1 * c1 * c1 + c2 * c2 * c2);
    } else {
      long c = N / K;
      System.out.println(c * c * c);
    }

  }

}