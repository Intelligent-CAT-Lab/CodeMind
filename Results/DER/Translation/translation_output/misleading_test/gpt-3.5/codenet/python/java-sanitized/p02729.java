import java.util.Scanner;

public class p02729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;

        int result = even + odd;
        System.out.println(result);
    }
}