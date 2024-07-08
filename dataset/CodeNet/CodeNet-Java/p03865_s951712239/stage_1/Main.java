import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
var newVariable_0 = sc.next();    char[] S = newVariable_0.toCharArray();
    boolean even = S.length % 2 == 0;
    boolean match = S[0] == S[S.length - 1];
    System.out.println((even ^ match) ? "Second" : "First");
  }
}
