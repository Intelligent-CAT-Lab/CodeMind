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



import java.util.Scanner;

public class p03591:
    def main(self, args):
        sc = Scanner(System.in)

        s = sc.next()
        if s.length() < 4:
            System.out.println("No")
            return
        s2 = s.substring(0, 4)
        if s2.equals("YAKI"):
            System.out.println("Yes")
        else:
            System.out.println("No")