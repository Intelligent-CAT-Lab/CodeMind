class main:
    import java.util.Scanner;
    
    public class p03657 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if( a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }