```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            int[][] ans = new int[n][n];
            ans[1][0] = ans[0][1] = 1;

            for (int vn = 3; vn <= n; vn++) {
                int mx = 0;
                List<Integer> path = new ArrayList<>();
                for (int i = 0; i < vn - 1; i++) {
                    path.add(i);
                }

                int[] perm = new int[vn - 1];
                for (int i = 0; i < vn - 1; i++) {
                    perm[i] = i;
                }
                do {
                    int cur = 0;
                    for (int i = 0; i < perm.length - 1; i++) {
                        cur += ans[path.get(perm[i])][path.get(perm[i + 1])];
                    }
                    if (cur > mx) {
                        mx = cur;
                    }
                } while (nextPerm(perm));

                ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
                ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
                for (int j = 1; j < vn - 2; j++) {
                    ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
                }
            }

            for (int[] row : ans) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean nextPerm(int[] array) {
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                for (int j = array.length - 1; j >= 0; j--) {
                    if (array[j] > array[i]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        for (int l = i + 1, k = array.length - 1; l < k; l++, k--) {
                            temp = array[l];
                            array[l] = array[k];
                            array[k] = temp;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
```
