import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
System.out.println("[INST]6;r;sc.nextInt();"+r);
    int g = sc.nextInt();
System.out.println("[INST]7;g;sc.nextInt();"+g);
    int b = sc.nextInt();
System.out.println("[INST]8;b;sc.nextInt();"+b);

    String s = String.valueOf(g)+String.valueOf(b);
System.out.println("[INST]10;None;String.valueOf(g);"+String.valueOf(g));
System.out.println("[INST]10;None;String.valueOf(b);"+String.valueOf(b));
    int k = Integer.parseInt(s);
System.out.println("[INST]11;k;Integer.parseInt(s);"+k);

    if (k % 4 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

}
