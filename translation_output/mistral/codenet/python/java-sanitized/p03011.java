import java.util.Scanner;

public class p03011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(a + b + c - Math.max(a, b, c));
    }
}