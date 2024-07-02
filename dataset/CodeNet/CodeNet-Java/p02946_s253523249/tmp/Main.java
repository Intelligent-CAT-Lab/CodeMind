import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
System.out.println("[INST]6;k;sc.nextInt();"+k);
    int x = sc.nextInt();
System.out.println("[INST]7;x;sc.nextInt();"+x);
    
    int min = x - k + 1;
    int max = x + k - 1;

    for (int i = min; i <= max; i++) {
      System.out.print(i + (i == max ? "": " "));
    }
    System.out.println();
    
  }
}
