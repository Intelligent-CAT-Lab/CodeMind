import java.util.*;

public class p00341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[12];
        for (int i = 0; i < 12; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            a[b[i] - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3? "yes" : "no");
    }
}