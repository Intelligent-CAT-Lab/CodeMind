import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the inputs and parsing them to integers
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        // Performing the arithmetic operations
        int a = x2 - x1;
        int b = y2 - y1;

        // Printing the results
        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
        
        scanner.close();
    }
}