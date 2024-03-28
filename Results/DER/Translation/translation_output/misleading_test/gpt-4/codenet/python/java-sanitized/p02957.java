import java.util.Scanner;

public class p02957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if(A != B) {
            int x = (A * A - B * B) / (2 * (A - B)); // In Java, integer division results in an integer
            double exactValue = ((double) A * A - (double) B * B) / (2 * (A - B));
            if (exactValue == x) {
                System.out.println(x);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        } else {
            // Handling the situation where A equals B to prevent division by zero
            System.out.println("IMPOSSIBLE");
        }
    }
}