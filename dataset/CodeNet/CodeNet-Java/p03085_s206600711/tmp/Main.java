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
System.out.println("[INST]14;s;sc.next();"+s);

    if (s.equals("A")) {
System.out.println("[INST]16;None;s.equals('A');"+s.equals("A"));
      os.println("T");
    }
    if (s.equals("T")) {
System.out.println("[INST]19;None;s.equals('T');"+s.equals("T"));
      os.println("A");
    }
    if (s.equals("G")) {
System.out.println("[INST]22;None;s.equals('G');"+s.equals("G"));
      os.println("C");
    }
    if (s.equals("C")) {
System.out.println("[INST]25;None;s.equals('C');"+s.equals("C"));
      os.println("G");
    }
  }
}