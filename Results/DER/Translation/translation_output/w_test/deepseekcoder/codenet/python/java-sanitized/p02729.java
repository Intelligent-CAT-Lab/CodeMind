import java.util.Scanner;

public class p02729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long even = (long)n * (n-1) / 2;
        long odd = (long)m * (m-1) / 2;

        System.out.println(even + odd);
    }
}