import java.util.Scanner;

public class p03212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(dfs("0"));
    }

    public static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        if (s.chars().filter(c -> c == '7' || c == '5' || c == '3').count() == 4) {
            ret = 0;
        }
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }
}