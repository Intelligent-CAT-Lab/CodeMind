import java.util.Scanner;

public class p03105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Conditional check and output
        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
        
        // Close the scanner
        scanner.close();
    }
}