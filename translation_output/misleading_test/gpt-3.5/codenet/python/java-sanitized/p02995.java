import java.util.Scanner;

public class p02995 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        
        int ans = calculate(a, b, c, d);
        System.out.println(ans);
    }
    
    public static int calculate(int a, int b, int c, int d) {
        int lcm = c * d / gcd(c, d);
        return b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}