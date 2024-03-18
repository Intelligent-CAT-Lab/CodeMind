import java.util.Scanner;

public class p02729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the two integers
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Calculating the sum of even and odd pairs
        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;
        
        // Printing the result
        System.out.println(even + odd);
        
        scanner.close();
    }
}