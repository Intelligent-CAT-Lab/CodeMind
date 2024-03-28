import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            Ts[i-1] = i + offset;
            sum += Ts[i-1];
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        System.out.println(sum - mini);
    }
}