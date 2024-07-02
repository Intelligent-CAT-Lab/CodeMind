import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
    String ans = "No";
    if (S.contains("N") && S.contains("S") && S.contains("E") && S.contains("W")) {
System.out.println("[INST]7;None;S.contains('N');"+S.contains("N"));
System.out.println("[INST]7;None;S.contains('S');"+S.contains("S"));
System.out.println("[INST]7;None;S.contains('E');"+S.contains("E"));
System.out.println("[INST]7;None;S.contains('W');"+S.contains("W"));
      ans = "Yes";
    }
    if (S.contains("N") && S.contains("S") && !S.contains("E") && !S.contains("W")) {
System.out.println("[INST]10;None;S.contains('N');"+S.contains("N"));
System.out.println("[INST]10;None;S.contains('S');"+S.contains("S"));
System.out.println("[INST]10;None;S.contains('E');"+S.contains("E"));
System.out.println("[INST]10;None;S.contains('W');"+S.contains("W"));
      ans = "Yes";
    }
    if (!S.contains("N") && !S.contains("S") && S.contains("E") && S.contains("W")) {
System.out.println("[INST]13;None;S.contains('N');"+S.contains("N"));
System.out.println("[INST]13;None;S.contains('S');"+S.contains("S"));
System.out.println("[INST]13;None;S.contains('E');"+S.contains("E"));
System.out.println("[INST]13;None;S.contains('W');"+S.contains("W"));
      ans = "Yes";
    }
    System.out.println(ans);
  }
}