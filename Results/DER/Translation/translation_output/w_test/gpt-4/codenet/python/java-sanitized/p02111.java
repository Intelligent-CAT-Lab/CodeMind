import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input
        int input = scanner.nextInt();
        
        // Calculate divmod equivalent
        int multipliedInput = input * 2;
        int div = multipliedInput / 60; // Equivalent to div
        int mod = multipliedInput % 60; // Equivalent to mod
        
        // Output the result
        System.out.println(div + " " + mod);
        
        scanner.close();
    }
}