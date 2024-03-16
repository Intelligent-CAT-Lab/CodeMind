import java.util.Scanner;

public class p02865 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading integer input from the user
        int n = scanner.nextInt();
        // Calculating and printing the result
        System.out.println((n - 1) / 2);
        scanner.close();
    }
}