import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = dfs("0");
        System.out.println(result);
    }

    public static int dfs(String s) {
        if (s.length() > n) {
            return 0;
        }
        int ret = 1;
        for (char c : '753'.toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }
}