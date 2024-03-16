import java.util.Scanner;

public class p03071 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from user input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculate values based on A and B
        int sum = A + B;
        int doubleAminusOne = 2 * A - 1;
        int doubleBminusOne = 2 * B - 1;
        
        // Find the maximum value among the calculated values
        int maxVal = Math.max(Math.max(sum, doubleAminusOne), doubleBminusOne);

        // Print the maximum value
        System.out.println(maxVal);

        scanner.close();
    }
}