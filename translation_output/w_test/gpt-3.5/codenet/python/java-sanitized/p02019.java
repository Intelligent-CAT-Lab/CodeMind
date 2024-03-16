import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = n - (c + a - c + b - c);
        System.out.println(result);
    }
}