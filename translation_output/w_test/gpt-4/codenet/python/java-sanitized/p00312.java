import java.util.Scanner;

public class p00312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers D and L
        int D = scanner.nextInt();
        int L = scanner.nextInt();

        // Perform the division operation as per the given Python code
        int ans = D / L + (D - L * (D / L));

        // Print the result
        System.out.println(ans);

        scanner.close();
    }
}