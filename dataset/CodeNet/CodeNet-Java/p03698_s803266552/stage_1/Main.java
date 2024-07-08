import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
var newVariable_0 = s.length();    char[] c = new char[newVariable_0];
    c = s.toCharArray();
    Arrays.sort(c);

var newVariable_1 = s.length();    for(int i = 0; i < newVariable_1-1; i++) {
      if(c[i] == c[i+1]) {
        System.out.println("no");
        return;
      }
    }
    System.out.println("yes");
  }
}
