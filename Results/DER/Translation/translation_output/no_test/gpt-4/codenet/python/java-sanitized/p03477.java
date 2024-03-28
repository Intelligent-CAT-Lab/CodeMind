import java.util.Scanner;

public class p03477 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the inputs
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        // Compare the sums and print the result
        if (A + B < C + D) {
            System.out.println("Right");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
        
        scanner.close();
    }
}