import java.util.*;

public class p00379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n, m;
        String input = sc.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        n = Integer.parseInt(split[1]);
        m = Integer.parseInt(split[2]);
        int ans = 0;
        for (int y = 1; y < 50; y++) {
            int x = (y + a) * Math.pow(2, n);
            if (x <= m && y == Integer.parseInt(Integer.toString(x))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}