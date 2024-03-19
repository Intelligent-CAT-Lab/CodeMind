<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
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
```
'''
<|endoftext|>
