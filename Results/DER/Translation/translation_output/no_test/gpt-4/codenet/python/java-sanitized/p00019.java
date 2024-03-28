import java.util.Scanner;

public class p00019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); // Prompt for input in Java
        int n = scanner.nextInt();
        scanner.close();

        long k = 1; // Use long in case of large factorials
        for(int j = 1; j <= n; j++) {
            k *= j;
        }

        System.out.println(k);
    }
}