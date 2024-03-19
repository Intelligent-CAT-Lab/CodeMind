import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dfs(n));
    }

    public static int dfs(int n) {
        if (n > 0) {
            return 0;
        }
        int ret = 1;
        for (int i = 0; i < 3; i++) {
            ret += dfs(n + i);
        }
        return ret;
    }
}