import java.util.*;

public class p02997 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K > ((N-1)*(N-2))/2) {
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println(N-1+((N-1)*(N-2))/2-K);

        for (int i = 2; i <= N; i++) {
            System.out.println("1 " + i);
        }

        int a = 0;
        for (int i = 2; i <= N-1; i++) {
            for (int j = i+1; j <= N; j++) {
                if (a < ((N-1)*(N-2))/2-K) {
                    System.out.println(i + " " + j);
                    a += 1;
                }
            }
        }
    }
}