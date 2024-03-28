import java.util.Scanner;

public class p02811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        
        System.out.println(500 * K >= X ? "Ye" : "No");
        scanner.close();
    }
}

// Sample test case
// Input: 2 900
// Expected Output: Ye