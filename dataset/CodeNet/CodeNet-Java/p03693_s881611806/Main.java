import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();

    String s = String.valueOf(g)+String.valueOf(b);
    int k = Integer.parseInt(s);

    if (k % 4 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

}
