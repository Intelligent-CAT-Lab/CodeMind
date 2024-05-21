import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            int ng = N;
            for (int s = 1; s <= N; s++) {
                ng--;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    System.out.println(s + " " + t);
                }
            }
        } else {
            int ng = N - 1;
            for (int s = 1; s <= N; s++) {
                ng--;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    System.out.println(s + " " + t);
                }
            }
        }
    }
}