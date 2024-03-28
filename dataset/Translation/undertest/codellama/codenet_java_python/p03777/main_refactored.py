class main:
    import java.util.Scanner;
    
    public class p03777 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
          System.out.println("H");
        } else {
          System.out.println("D");
        }
      }
    }
    
    
    
    import sys
    
    a, b = sys.stdin.readline().split()
    
    if a == b:
        print("H")
    else:
        print("D")