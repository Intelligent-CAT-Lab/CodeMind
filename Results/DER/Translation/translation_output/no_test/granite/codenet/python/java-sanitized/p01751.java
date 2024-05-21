import java.util.Scanner;

public class p01751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                return;
            }
            t += a + b;
        }
        System.out.println(-1);
    }
}