import java.util.Scanner;

public class p02697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int a = 1;
        int b = N / 2;
        int c = N / 2 + 1;
        int d = N;
        if (N % 2 == 0) {
            a += 1;
        }
        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i++;
                c += 1;
                d -= 1;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a += 1;
                b -= 1;
                i++;
            } else {
                break;
            }
        }
    }
}