import java.util.Scanner;

public class p02831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(lcm(A, B));
        sc.close();
    }
    
    // Method to compute the greatest common divisor (Euclid's algorithm)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    // Method to compute the least common multiple
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}