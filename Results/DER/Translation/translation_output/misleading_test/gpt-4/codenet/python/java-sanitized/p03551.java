import java.util.Scanner;

public class p03551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int time = 1900 * M + (N - M) * 100;
        int result = time * (1 << M); // 2^M can be calculated using a bit shift to the left (<<)

        System.out.println(result);
        scanner.close();
    }
}