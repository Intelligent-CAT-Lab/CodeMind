import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    for (int i = 0; i < 3; i++) S[i] = (S[i] == '1') ? '9' : '1';
    System.out.println(S);
  }
}