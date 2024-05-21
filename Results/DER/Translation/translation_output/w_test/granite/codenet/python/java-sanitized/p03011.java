import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int result = a + b + c - max;
        System.out.println(result);
    }
}