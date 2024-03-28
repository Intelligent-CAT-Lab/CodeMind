import java.util.Scanner;

public class p03861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input is given in the same line separated by spaces, as in the Python example:
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        // Compute the result using integer division
        int result = b / x - (a - 1) / x;

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}