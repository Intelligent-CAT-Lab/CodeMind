import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dfs("0", n));
    }

    public static int dfs(String s, int n) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        if (s.contains("7") && s.contains("5") && s.contains("3")) {
            ret = 1;
        } else {
            ret = 0;
        }
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c, n);
        }
        return ret;
    }
}