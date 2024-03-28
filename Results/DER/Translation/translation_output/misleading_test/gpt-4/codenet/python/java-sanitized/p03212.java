import java.util.Scanner;

public class p03212 {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();

        System.out.println(dfs("0") - 1); // Subtract 1 to exclude the initial "0"
    }

    private static int dfs(String s) {
        int number = Integer.parseInt(s);
        if (number > n) {
            return 0;
        }

        int ret = (s.contains("7") && s.contains("5") && s.contains("3")) ? 1 : 0;

        ret += dfs(s + "7");
        ret += dfs(s + "5");
        ret += dfs(s + "3");

        return ret;
    }
}