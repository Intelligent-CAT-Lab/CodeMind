import java.util.*;

public class p02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < 9; i++) {
            int k = n[i] + s;
            if (k < 5 || (k == 5 && n[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}