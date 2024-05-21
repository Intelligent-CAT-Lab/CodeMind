import java.util.*;

public class p02994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        List<Integer> Ts = new ArrayList<>();
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts.add(i + offset);
            if (Math.abs(i + offset) < Math.abs(absmin)) {
                absmin = i + offset;
                mini = i + offset;
            }
        }
        int sum = 0;
        for (int t : Ts) {
            sum += t;
        }
        System.out.println(sum - mini);
    }
}