import java.util.Scanner;

public class p02865 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // In Java, the / operator performs integer division when both operands are integers
        System.out.println((n - 1) / 2);
        
        scanner.close();
    }
}