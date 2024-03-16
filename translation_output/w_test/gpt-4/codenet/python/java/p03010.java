Here's the translated code from Python to Java. Keep in mind that Java is more verbose than Python, and we need to handle input/output and permutations manually.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            List<Integer> vertices = new ArrayList<>();
            for (int i = 0; i < vn - 1; i++) {
                vertices.add(i);
            }
            List<List<Integer>> allPermutations = new ArrayList<>();
            permute(allPermutations, vertices, 0);
            for (List<Integer> path : allPermutations) {
                int cur = 0;
                for (int i = 0; i < path.size() - 1; i++) {
                    cur += ans[path.get(i)][path.get(i + 1)];
                }
                if (cur > mx) mx = cur;
            }

            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }

        for (int[] row : ans) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private static void permute(List<List<Integer>> allPermutations, List<Integer> arr, int k) {
        if (k == arr.size() - 1) {
            allPermutations.add(new ArrayList<>(arr));
        } else {
            for (int i = k; i < arr.size(); i++) {
                Collections.swap(arr, i, k);
                permute(allPermutations, arr, k + 1);
                Collections.swap(arr, k, i);
            }
        }
    }
}
```
