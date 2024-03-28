import java.util.Scanner;

public class p03777 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    if (a.equals("H")) {
      System.out.println(b);
    } else {
      if (b.equals("H")) {
        System.out.println("D");
      } else {
        System.out.println("H");
      }
    }
  }
}