import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b, c;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int result = n - (c + a - c + b - c);
        System.out.println(result);
    }
}