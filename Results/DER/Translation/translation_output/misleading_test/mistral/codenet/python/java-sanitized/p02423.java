import java.util.Scanner;

public class p02423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;
        System.out.printf("%032d%n", n);
        System.out.printf("%032d%n", ~n & mask);
        System.out.printf("%032d%n", (n << 1) & mask);
        System.out.printf("%032d%n", (n >> 1) & mask);
    }
}