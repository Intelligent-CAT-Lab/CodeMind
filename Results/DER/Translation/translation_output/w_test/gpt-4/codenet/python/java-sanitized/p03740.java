import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(Math.abs(x - y) <= 1 ? "Brown" : "Alice");

        scanner.close();
    }
}