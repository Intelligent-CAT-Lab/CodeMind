import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = dfs(n, "0");
        System.out.println(result);
    }

    public static int dfs(int n, String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        if (s.contains("7") && s.contains("5") && s.contains("3")) {
            ret = 1;
        } else {
            ret = 0;
        }
        for (char c : new char[] {'7', '5', '3'}) {
            ret += dfs(n, s + c);
        }
        return ret;
    }
}