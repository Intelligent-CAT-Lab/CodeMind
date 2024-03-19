import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts[i] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        System.out.println(sum(Ts) - mini);
    }

    public static int sum(int[] Ts) {
        int sum = 0;
        for (int i = 0; i < Ts.length; i++) {
            sum += Ts[i];
        }
        return sum;
    }
}