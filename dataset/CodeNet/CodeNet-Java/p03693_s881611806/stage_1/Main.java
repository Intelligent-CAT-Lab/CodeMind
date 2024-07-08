import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();

var newVariable_0 = String.valueOf(g);var newVariable_1 = String.valueOf(b);    String s = String.valueOf(g)+newVariable_1;
    int k = Integer.parseInt(s);

    if (k % 4 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

}
