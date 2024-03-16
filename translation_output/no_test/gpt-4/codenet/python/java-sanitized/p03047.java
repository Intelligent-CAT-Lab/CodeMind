import java.util.Scanner;

public class p03047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = N - (K - 1);
        System.out.println(result);

        scanner.close();
    }
}