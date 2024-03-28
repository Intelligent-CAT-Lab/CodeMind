import java.util.*;

public class p03828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int[] count = new int[N];
        int ans = 1;
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (i % num[j] == 0) {
                    count[j]++;
                    i /= num[j];
                    break;
                }
            } else {
                num[i-2] = i;
                count[i-2] = 1;
            }
        }
        for (int i = 0; i < N; i++) {
            ans = (ans * (count[i] + 1)) % 1000000007;
        }
        System.out.println(ans);
    }
}