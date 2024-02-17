import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans = "No";
    if (S.contains("N") && S.contains("S") && S.contains("E") && S.contains("W")) {
      ans = "Yes";
    }
    if (S.contains("N") && S.contains("S") && !S.contains("E") && !S.contains("W")) {
      ans = "Yes";
    }
    if (!S.contains("N") && !S.contains("S") && S.contains("E") && S.contains("W")) {
      ans = "Yes";
    }
    System.out.println(ans);
  }
}