import java.util.*;

public class p02697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int a, b, c, d;
        a = 1;
        b = N / 2;
        c = N / 2 + 1;
        d = N;

        if (N % 2 == 0) {
            a += 1;
        }

        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i += 1;
                c += 1;
                d -= 1;
            } else {
                break;
            }

            if (i < M) {
                System.out.println(a + " " + b);
                a += 1;
                b -= 1;
                i += 1;
            } else {
                break;
            }
        }
    }
}