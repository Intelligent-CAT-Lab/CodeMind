import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String[] sArray = new String[3];
var newVariable_0 = s.split("");    sArray[0] = newVariable_0[0];
var newVariable_1 = s.split("");    sArray[1] = newVariable_1[1];
var newVariable_2 = s.split("");    sArray[2] = newVariable_2[2];
    int count = 0;

var newVariable_3 = sArray[0].equals("1");    if (newVariable_3) count += 1;
var newVariable_4 = sArray[1].equals("1");    if (newVariable_4) count += 1;
var newVariable_5 = sArray[2].equals("1");    if (newVariable_5) count += 1;

    System.out.println(count);
  }
}
