import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
System.out.println("[INST]5;N;sc.nextInt();"+N);
    int A = sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
    int B = sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);
    
    System.out.println(N*A < B ? N*A : B);
  }
}