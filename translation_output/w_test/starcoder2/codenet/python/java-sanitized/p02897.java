import java.util.Scanner;

public class p02897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(-(-N/2)/N);
    }
}




import java.util.Scanner;

public class p02897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (i + j == K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/2020-01-20-