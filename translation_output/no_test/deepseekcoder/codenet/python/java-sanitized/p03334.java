import java.util.Scanner;

public class p03334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        scanner.close();

        Judge j1 = new Judge(D1);
        Judge j2 = new Judge(D2);

        int cnt = 0;
        for (int x = 0; x < 2 * N; x++) {
            for (int y = 0; y < 2 * N; y++) {
                if (j