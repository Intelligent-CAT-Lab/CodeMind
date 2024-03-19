import java.util.Scanner;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        long d = Long.parseLong(input[3]);

        long ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(ans);
    }
}