import java.util.Scanner;

public class atcoder_ABC178_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int ans = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));

        System.out.println(ans);
    }
}