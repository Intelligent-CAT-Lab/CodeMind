import java.util.*;

public class p03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};
        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(Arrays.stream(new int[vn - 1]).mapToObj(i -> i).toArray(Integer[]::new))) {
                int cur = Arrays.stream(path).map(v -> ans[v][path[path.length - 1]]).sum();
                if (cur > mx) mx = cur;
            }

            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }

        for (int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static <T> List<T[]> permutations(T[] arr) {
        List<T[]> res = new ArrayList<>();
        if (arr.length == 0) {
            res.add(arr);
            return res;
        }
        for (int i = 0; i < arr.length; i++) {
            T[] newArr = Arrays.copyOf(arr, arr.length);
            T temp = newArr[i];
            newArr[i] = newArr[arr.length - 1];
            newArr[arr.length - 1] = temp;
            List<T[]> subRes = permutations(Arrays.copyOfRange(newArr, 0, arr.length - 1));
            for (T[] subArr : subRes) {
                res.add(Arrays.copyOf(subArr, arr.length));
            }
        }
        return res;
    }
}