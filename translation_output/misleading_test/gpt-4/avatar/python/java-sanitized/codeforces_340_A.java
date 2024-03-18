import java.util.Scanner;

public class codeforces_340_A {
    // Helper method to calculate the Greatest Common Divisor (GCD)
    private static long GCD(long a, long b) {
        while (a % b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
    
    // Helper method to calculate the Least Common Multiple (LCM)
    private static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        String[] input = scanner.nextLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        long a = Long.parseLong(input[2]);
        long b = Long.parseLong(input[3]);
        
        // Calculate LCM of x and y
        long lcm = LCM(x, y);
        
        // Output the result according to the logic in the provided Python code
        System.out.println(b / lcm - (a - 1) / lcm);
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}