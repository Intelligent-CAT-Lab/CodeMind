import java.util.ArrayList;
import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        ArrayList<Integer> Ts = new ArrayList<>();
        int offset = L - 1;
        double absmin = Double.POSITIVE_INFINITY;
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            Ts.add(i + offset);
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        int sum = 0;
        for (int T : Ts) {
            sum += T;
        }
        System.out.println(sum - mini);
    }
}