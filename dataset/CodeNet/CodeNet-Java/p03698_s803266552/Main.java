import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[s.length()];
    c = s.toCharArray();
    Arrays.sort(c);

    for(int i = 0; i < s.length()-1; i++) {
      if(c[i] == c[i+1]) {
        System.out.println("no");
        return;
      }
    }
    System.out.println("yes");
  }
}
