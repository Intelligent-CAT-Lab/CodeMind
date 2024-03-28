import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] remain = new int[2020];
        int now = 0;
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            now += (s.charAt(i) - '0') * Math.pow(10, s.length() - i - 1, 2019);
            ans += remain[(int) (now % 2019)];
            remain[(int) (now % 2019)]++;
        }
        ans += remain[0];
        System.out.println(ans);
    }
}