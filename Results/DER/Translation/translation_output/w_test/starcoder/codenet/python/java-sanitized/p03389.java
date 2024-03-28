import java.util.*;

public class p03389 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] a = new int[]{A, B, C};
        Arrays.sort(a);

        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }

        s += sum(a) % 3;

        System.out.println(s);
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }
}