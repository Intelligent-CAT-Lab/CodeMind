import java.util.Scanner;

public class p03059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, t;
        a = scanner.nextInt();
        b = scanner.nextInt();
        t = scanner.nextInt();
        System.out.println((t / a) * b);
    }
}