import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04001 {

    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // When the deepest part is reached
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j + 1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size() - 1)));
            return ans;
        }

        // When + is inserted at the ith position
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // When + is not inserted at the ith position
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        List<Integer> sep = new ArrayList<>();
        sep.add(0);
        System.out.println(dfs(0, sep, s, 0));

        scanner.close();
    }
}