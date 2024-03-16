import java.util.Scanner;

public class p02759 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int a = (n + 1) / 2; // When dividing two integers in Java, the result is automatically truncated

        System.out.println(a);
        
        scanner.close();
    }
}