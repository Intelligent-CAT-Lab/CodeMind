import java.util.Scanner;

public class p03826 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the four integer inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        // Calculating the products
        int s = a * b;
        int t = c * d;
        
        // Printing the greater product
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
        
        scanner.close();
    }
}