import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Collections;

public class p03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        long[][] ans = new long[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            long mx = 0;
            for (ArrayList<Integer> path : permutations(vn - 1)) {
                long cur = 0;
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }

    static ArrayList<ArrayList<Integer>> permutations(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) numbers.add(i);
        ArrayList<ArrayList<Integer>> permList = new ArrayList<>();
        permute(numbers, 0, permList);
        return permList;
    }

    static void permute(ArrayList<Integer> arr, int k, ArrayList<ArrayList<Integer>> permList) {
        for (int i = k; i < arr.size(); i++) {
            Collections.swap(arr, i, k);
            permute(arr, k + 1, permList);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {
            permList.add(new ArrayList<>(arr));
        }
    }
}