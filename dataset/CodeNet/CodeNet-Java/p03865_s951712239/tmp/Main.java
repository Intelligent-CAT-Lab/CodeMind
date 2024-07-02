import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    char[] S = sc.next().toCharArray();
System.out.println("[INST]6;S;sc.next().toCharArray();"+S);
System.out.println("[INST]6;None;sc.next();"+sc.next());
    boolean even = S.length % 2 == 0;
    boolean match = S[0] == S[S.length - 1];
    System.out.println((even ^ match) ? "Second" : "First");
  }
}
