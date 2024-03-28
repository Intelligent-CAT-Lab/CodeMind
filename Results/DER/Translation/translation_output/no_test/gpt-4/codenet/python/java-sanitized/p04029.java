import java.util.Scanner;

public class p04029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println((int)((n + 1L) * n / 2));
        scanner.close();
    }
}