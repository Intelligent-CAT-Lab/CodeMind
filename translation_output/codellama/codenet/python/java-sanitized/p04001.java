import java.util.Scanner;

public class p04001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int[] sep = new int[n];
        int tot = 0;
        dfs(0, sep, s, tot);
        System.out.println(tot);
    }

    private static void dfs(int i, int[] sep, String s, int tot) {
        if (i == s.length()) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        sep[i] = i;
        tot += dfs(i, sep, s, 0);

        sep[i] = 0;
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}