import java.util.*;
public class p02450 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (List<Integer> p : new ArrayList<>(new Permutations(n))) {
            for (int i : p) System.out.print(i + " ");
            System.out.println();
        }
    }
}

class Permutations {
    List<List<Integer>> res = new ArrayList<>();
    public Permutations(int n) {
        dfs(n, new ArrayList<>());
    }
    public List<List<Integer>> getPermutations() {
        return res;
    }
    private void dfs(int n, List<Integer> path) {
        if (path.size() == n) res.add(new ArrayList<>(path));
        else {
            for (int i = 1; i <= n; i++) {
                if (!path.contains(i)) {
                    path.add(i);
                    dfs(n, path);
                    path.remove(path.size() - 1);
                }
            }
        }
    }
}