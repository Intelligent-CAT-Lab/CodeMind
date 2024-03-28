<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
0 6 15
6 0 21
15 21 0


```
from itertools import permutations
import sys

sys.setrecursionlimit(10 ** 6)
int1 = lambda x: int(x) - 1
p2D = lambda x: print(*x, sep="\n")
def II(): return int(sys.stdin.readline())
def MI(): return map(int, sys.stdin.readline().split())
def LI(): return list(map(int, sys.stdin.readline().split()))
def LLI(rows_number): return [LI() for _ in range(rows_number)]
def SI(): return sys.stdin.readline()[:-1]

def main():
    n=II()
    base=[1, 2, 4, 7, 12, 20, 29, 38, 52, 73]

    ans=[[0]*n for _ in range(n)]
    ans[1][0]=ans[0][1]=1

    for vn in range(3,n+1):
        mx=0
        for path in permutations(range(vn-1)):
            cur=sum(ans[v0][v1] for v0,v1 in zip(path,path[1:]))
            if cur>mx:mx=cur

        ans[vn - 1][0] = ans[0][vn - 1] = base[vn-2] * (mx + 1)
        ans[vn - 1][vn-2] = ans[vn-2][vn - 1] = base[vn-3] * (mx + 1)
        for j in range(1,vn-2):
            ans[vn-1][j]=ans[j][vn-1]=base[j-1]*(mx+1)

    for row in ans:print(*row)

main()
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] base = new int[]{1, 2, 4, 7, 12, 20, 29, 38, 52, 73};
        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;
        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            for (int[] path : permutations(vn - 1)) {
                int cur = 0;
                for (int i = 0; i < path.length - 1; i++) {
                    cur += ans[path[i]][path[i + 1]];
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
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static <T> List<T> permutations(int n) {
        List<T> ans = new ArrayList<>();
        if (n == 0) return ans;
        ans.add(null);
        for (int i = 1; i <= n; i++) {
            List<T> tmp = new ArrayList<>();
            for (T t : ans) {
                for (int j = 0; j <= t.toString().length(); j++) {
                    tmp.add(insert(t, i, j));
                }
            }
            ans = tmp;
        }
        return ans;
    }

    public static <T> T insert(T t, int i, int j) {
        if (t == null) return (T) (new StringBuilder().append(i)).toString();
        StringBuilder sb = new StringBuilder(t.toString());
        sb.insert(j, i);
        return (T) sb.toString();
    }
}
```
<|endoftext|>
