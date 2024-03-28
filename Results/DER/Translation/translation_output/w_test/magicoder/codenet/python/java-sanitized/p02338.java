import java.util.Scanner;

public class p02338 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(N <= K ? 1 : 0);
    }
}