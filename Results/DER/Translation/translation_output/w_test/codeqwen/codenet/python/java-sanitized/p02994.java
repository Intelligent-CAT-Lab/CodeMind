import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        resolve();
    }

    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int L = Integer.parseInt(inputs[1]);
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            Ts[i] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        System.out.println(sum(Ts) - mini);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}