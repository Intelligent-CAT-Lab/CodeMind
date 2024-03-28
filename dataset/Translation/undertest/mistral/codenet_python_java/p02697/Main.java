import java.util.Scanner;

public class p02697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int a = 1, b = N / 2, c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a++;
        }
        for (int i = 0; i < M; i++) {
            if (i < M) {
                System.out.println(c + ", " + d);
                c++;
                d--;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + ", " + b);
                a++;
                b--;
            } else {
                break;
            }
        }
    }
}