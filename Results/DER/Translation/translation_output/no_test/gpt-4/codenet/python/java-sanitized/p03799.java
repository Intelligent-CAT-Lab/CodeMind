import java.util.Scanner;

public class p03799 {

    private static int INT() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] MI() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] input = MI();
        int N = input[0];
        int M = input[1];

        int ans;
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }

        System.out.println(ans);
    }
}