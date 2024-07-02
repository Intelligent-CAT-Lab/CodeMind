import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
System.out.println("[INST]14;n;sc.nextInt();"+n);
    int a = sc.nextInt();
System.out.println("[INST]15;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]16;b;sc.nextInt();"+b);
    os.println(Math.min(a * n, b));
  }
}