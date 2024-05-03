import java.util.Scanner;

public class p02150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}