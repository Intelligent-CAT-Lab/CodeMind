import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int x = sc.nextInt();
    
    int min = x - k + 1;
    int max = x + k - 1;

    for (int i = min; i <= max; i++) {
      System.out.print(i + (i == max ? "": " "));
    }
    System.out.println();
    
  }
}
