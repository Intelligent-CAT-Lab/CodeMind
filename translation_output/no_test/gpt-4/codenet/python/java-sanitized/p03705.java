import java.util.Scanner;

public class p03705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the three integers from the input line.
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (n >= 2) {
            if (b >= a) {
                System.out.println((long)(n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}