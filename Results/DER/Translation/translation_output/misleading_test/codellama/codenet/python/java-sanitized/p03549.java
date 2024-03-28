import java.util.Scanner;

public class p03549 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (2 ** M));
    }
}