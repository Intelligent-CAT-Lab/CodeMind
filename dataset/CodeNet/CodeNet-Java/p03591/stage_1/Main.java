import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
var newVariable_0 = s.length();    if(newVariable_0 < 4) {
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
var newVariable_1 = s2.equals( "YAKI");    if(newVariable_1)System.out.println("Yes");
    else System.out.println("No");

  }
}
