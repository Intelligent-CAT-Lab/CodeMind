import java.util.*;
public class p03106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int[] res = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res[i - 1] = i;
            }
        }
        Arrays.sort(res);
        System.out.println(res[k - 1]);
    }
}