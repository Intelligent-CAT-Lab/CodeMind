import java.util.Scanner;

public class atcoder_ABC070_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input and splitting it into four integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Calculating the result using built-in Math methods
        int result = Math.max(0, Math.min(b, d) - Math.max(a, c));
        
        // Printing the result
        System.out.println(result);
        
        // Closing the scanner resource
        scanner.close();
    }
}