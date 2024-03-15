import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] d = new int[t];
        int[] da = new int[t];
        int[] db = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            d[i] = sc.nextInt();
            da[i] = sc.nextInt();
            db[i] = sc.nextInt();
        }
        int[][] map = new int[t][t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                map[i][j] = a[i] - da[i] * i + b[j] - db[j] * j;
            }
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (map[i][j] == d || map[i][j] == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}