import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += Integer.parseInt(s.charAt(i)) * (int) Math.pow(10, s.length() - i - 1, 2019);
            ans += remain[now % 2019];
            remain[now % 2019] += 1;
        }

        ans += remain[0];

        System.out.println(ans);
    }
}