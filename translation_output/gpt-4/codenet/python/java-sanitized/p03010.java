import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p03010 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] base = new int[]{1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            List<List<Integer>> permutations = generatePermutations(vn - 1);
            for (List<Integer> path : permutations) {
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
            System.out.println(
                IntStream.of(row).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            );
        }
    }

    private static List<List<Integer>> generatePermutations(int n) {
        List<List<Integer>> permutations = new ArrayList<>();
        permuteHelper(IntStream.range(0, n).boxed().collect(Collectors.toList()), 0, permutations);
        return permutations;
    }

    private static void permuteHelper(List<Integer> arr, int k, List<List<Integer>> permutations) {
        for (int i = k; i < arr.size(); i++) {
            java.util.Collections.swap(arr, i, k);
            permuteHelper(arr, k + 1, permutations);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() - 1) {
            permutations.add(new ArrayList<>(arr));
        }
    }
}