class main:
    import java.util.Scanner;
    
    public class p03210 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
    
            if (age == 3 || age == 5 || age == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    
    
    import sys
    
    age = int(sys.stdin.readline())
    
    if age == 3 or age == 5 or age == 7:
        print("YES")
    else:
        print("NO")