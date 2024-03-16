import java.util.Scanner;

public class p02994 {

    public static void main(String[] args) {
        resolve();
    }

    private static void resolve() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            Ts[i] = i + 1 + offset;
            if(Math.abs(Ts[i]) < absmin) {
                absmin = Math.abs(Ts[i]);
                mini = Ts[i];
            }
        }

        int sum = sumArray(Ts);
        System.out.println(sum - mini);
        scanner.close();
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for(int value : array) {
            sum += value;
        }
        return sum;
    }
}