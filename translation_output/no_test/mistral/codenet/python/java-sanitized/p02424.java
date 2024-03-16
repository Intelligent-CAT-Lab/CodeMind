import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%032b%n", (a & b));
        System.out.printf("%032b%n", (a | b));
        System.out.printf("%032b%n", (a ^ b));
    }
}