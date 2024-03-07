import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ret = 0;
        for (int i = 0; i <= n; i++) {
            if (i > n) {
                break;
            }
            if (all(i.toString().count(c) > 0 for c in '753')) {
                ret++;
            }
            for (char c : "753") {
                ret += dfs(i + c);
            }
        }
        System.out.println(ret);
    }

    private static int dfs(int s) {
        if (s > n) {
            return 0;
        }
        int ret = 1;
        for (char c : "753") {
            ret += dfs(s + c);
        }
        return ret;
    }
}