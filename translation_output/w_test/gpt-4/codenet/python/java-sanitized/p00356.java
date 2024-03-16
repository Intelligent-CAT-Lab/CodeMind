import java.util.Scanner;

public class p00356 {
    // Java method to find GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int result = a + b - gcd(a, b) + 1;
        
        System.out.println(result);
    }
}