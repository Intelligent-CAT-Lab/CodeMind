import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans = "No";
var newVariable_0 = S.contains("N");var newVariable_1 = S.contains("S");var newVariable_2 = S.contains("E");var newVariable_3 = S.contains("W");    if (S.contains("N") && S.contains("S") && S.contains("E") && newVariable_3) {
      ans = "Yes";
    }
var newVariable_4 = S.contains("N");var newVariable_5 = S.contains("S");var newVariable_6 = S.contains("E");var newVariable_7 = S.contains("W");    if (S.contains("N") && S.contains("S") && !S.contains("E") && !newVariable_7) {
      ans = "Yes";
    }
var newVariable_8 = S.contains("N");var newVariable_9 = S.contains("S");var newVariable_10 = S.contains("E");var newVariable_11 = S.contains("W");    if (!S.contains("N") && !S.contains("S") && S.contains("E") && newVariable_11) {
      ans = "Yes";
    }
    System.out.println(ans);
  }
}