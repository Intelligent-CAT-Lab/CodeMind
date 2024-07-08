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

var newVariable_0 = s.equals("A");    if (newVariable_0) {
      os.println("T");
    }
var newVariable_1 = s.equals("T");    if (newVariable_1) {
      os.println("A");
    }
var newVariable_2 = s.equals("G");    if (newVariable_2) {
      os.println("C");
    }
var newVariable_3 = s.equals("C");    if (newVariable_3) {
      os.println("G");
    }
  }
}