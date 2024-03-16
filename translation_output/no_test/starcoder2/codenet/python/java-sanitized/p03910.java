import java.util.Scanner;

public class p03910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = 0;
        int x = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            x += i;
        }
        x -= N;
        for (int i = 1; i <= N; i++) {
            if (x == i) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/2019-09-25/README.md
# 2019-09-25