import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
System.out.println("[INST]8;N;sc.nextInt();"+N);
    int M = sc.nextInt();
System.out.println("[INST]9;M;sc.nextInt();"+M);

    sc.close();

    int X = 1900 * M + 100 * (N - M);

    int rate = 1;

    for (int i = 1; i <= M; i++){
      rate *= 2;
    }

    System.out.println(rate * X);

  }

}