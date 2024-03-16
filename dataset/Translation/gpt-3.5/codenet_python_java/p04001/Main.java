import java.util.*;

public class p04001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(dfs(0, new ArrayList<Integer>(Arrays.asList(0)), s, 0));
    }

    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i++;

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

        sep.add(i);
        tot += dfs(i, sep, s, 0);

        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}