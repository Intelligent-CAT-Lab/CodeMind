import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = dfs(0, n);
        System.out.println(result);
    }

    public static int dfs(int s, int n) {
        if (s > n) {
            return 0;
        }
        int ret = 1;
        if (s == 0 || s % 10 == 7 || s % 10 == 5 || s % 10 == 3) {
            ret = 0;
            for (int i = 0; i <= 9; i++) {
                if (i == 7 || i == 5 || i == 3) {
                    continue;
                }
                ret += dfs(s * 10 + i, n);
            }
        }
        return ret;
    }
}