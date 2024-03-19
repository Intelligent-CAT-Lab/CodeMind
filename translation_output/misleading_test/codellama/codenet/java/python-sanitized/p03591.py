import java.util.Scanner;

public class p03591 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    if(s.length() < 4) {
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
    if(s2.equals( "YAKI"))System.out.println("Yes");
    else System.out.println("No");

  }
}




s = input("Enter a string: ")
if len(s) < 4:
    print("No")
    return
s2 = s[:4]
if s2 == "YAKI":
    print("Yes")
else:
    print("No")