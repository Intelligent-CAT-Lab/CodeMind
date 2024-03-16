import java.util.Scanner;

public class p02823 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input (N, A, B) from the user, equivalent to map(int,input().split()) in Python
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculating the result based on the input values
        if ((A - B) % 2 == 0) {
            // Equivalent to Python's print((B - A) // 2)
            System.out.println((B - A) / 2);
        } else {
            // Equivalent to Python's print(min(A - 1, N - B) + 1 + (B - A) // 2)
            System.out.println(Math.min(A - 1, N - B) + 1 + (B - A) / 2);
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}