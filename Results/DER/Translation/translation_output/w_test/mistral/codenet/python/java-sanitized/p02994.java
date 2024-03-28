import java.util.*;

public class p02994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absMin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts[i - 1] = i + offset;
            if (Math.abs(i + offset) < absMin) {
                absMin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        System.out.println(Arrays.stream(Ts).sum() - mini);
    }
}