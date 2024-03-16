import java.util.Scanner;

public class p01905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while(num > 0) {
            ans++;
            num--;
        }
        System.out.println(ans - 1);
        sc.close();
    }
}