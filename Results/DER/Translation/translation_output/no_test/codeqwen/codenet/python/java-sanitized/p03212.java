import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dfs("0", n));
    }

    public static int dfs(String s, int n) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        boolean allDigitsPresent = true;
        for (char c : "753".toCharArray()) {
            if (s.indexOf(c) == -1) {
                allDigitsPresent = false;
                break;
            }
        }
        int ret = allDigitsPresent ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c, n);
        }
        return ret;
    }
}