import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read H and R
        int H = scanner.nextInt();
        int R = scanner.nextInt();
        
        // Perform the conditional checks and print the results
        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}