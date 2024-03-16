import java.util.Scanner;

public class p02392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading integer values separated by spaces
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Conditional check
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}