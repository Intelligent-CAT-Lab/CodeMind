import java.util.Scanner;

public class p03212 {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(dfs("0"));
    }

    static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = (s.contains("7") && s.contains("5") && s.contains("3")) ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }
}