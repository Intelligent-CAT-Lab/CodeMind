import java.util.Scanner;

public class p02729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long even = n * (long)(n-1) / 2;
        long odd = m * (long)(m-1) / 2;

        System.out.println(even + odd);
    }
}