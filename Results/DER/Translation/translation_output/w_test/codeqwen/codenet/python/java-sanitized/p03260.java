import java.util.Scanner;

public class p03260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}