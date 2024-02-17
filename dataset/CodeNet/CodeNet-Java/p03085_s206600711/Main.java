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
    String s = sc.next();

    if (s.equals("A")) {
      os.println("T");
    }
    if (s.equals("T")) {
      os.println("A");
    }
    if (s.equals("G")) {
      os.println("C");
    }
    if (s.equals("C")) {
      os.println("G");
    }
  }
}