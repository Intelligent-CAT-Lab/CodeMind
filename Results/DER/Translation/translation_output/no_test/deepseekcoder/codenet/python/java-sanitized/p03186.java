import java.util.Scanner;

public class p03186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c <= a + b + 1) {
            System.out.println(b + c);
        } else {
            System.out.println(a + 2 * b + 1);
        }
    }
}