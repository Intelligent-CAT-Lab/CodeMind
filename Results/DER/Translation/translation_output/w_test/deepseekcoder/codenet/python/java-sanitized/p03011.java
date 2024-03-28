import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b + c - maxOfThree(a, b, c));
    }

    private static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}