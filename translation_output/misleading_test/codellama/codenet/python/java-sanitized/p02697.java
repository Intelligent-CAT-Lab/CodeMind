import java.util.Scanner;

public class p02697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 1, b = N / 2;
        int c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a += 1;
        }
        for (int i = 0; i < M; i++) {
            System.out.println(c + " " + d);
            c += 1;
            d -= 1;
            System.out.println(a + " " + b);
            a += 1;
            b -= 1;
        }
    }
}