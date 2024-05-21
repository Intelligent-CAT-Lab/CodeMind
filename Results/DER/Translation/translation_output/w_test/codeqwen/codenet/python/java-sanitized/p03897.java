import java.util.ArrayList;
import java.util.List;

public class p03897 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 != 0) {
                ans.add(new int[]{i, 0});
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans.add(new int[]{i, j});
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 != 0) {
                        ans.add(new int[]{i, j});
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 != 0) {
                ans.add(new int[]{n - 1, j});
            }
        }
        System.out.println(ans.size());
        for (int[] xy : ans) {
            System.out.println(xy[0] + " " + xy[1]);
        }
    }
}