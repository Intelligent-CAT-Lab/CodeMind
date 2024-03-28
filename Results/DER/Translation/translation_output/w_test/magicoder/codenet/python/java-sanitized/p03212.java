import java.util.*;

public class p03212 {
    static int n;

    static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        for (char c : "753".toCharArray()) {
            if (s.indexOf(c) == -1) {
                ret = 0;
                break;
            }
        }
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(dfs("0"));
    }
}