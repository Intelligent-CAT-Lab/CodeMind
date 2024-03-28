import java.util.Scanner;

public class p03238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n == 1) {
            System.out.println("Hello World");
            // System.exit(0); // Uncomment if you want to match the Python behavior of exiting immediately
            return; // Exits the main method
        }
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}