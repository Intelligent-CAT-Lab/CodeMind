import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        resolve();
    }

    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);

        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            Ts[i-1] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }

        int sum = 0;
        for (int i : Ts) {
            sum += i;
        }

        System.out.println(sum - mini);
    }
}