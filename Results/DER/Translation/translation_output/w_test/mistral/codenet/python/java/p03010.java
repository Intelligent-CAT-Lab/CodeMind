<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};
    static int[][] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans = new int[n][n];

        for (int i = 1; i < n; i++) {
            ans[i][0] = ans[0][i] = base[i - 1];
        }

        for (int i = 3; i <= n; i++) {
            int mx = 0;
            for (int[] path : getPermutations(i - 1)) {
                int cur = getSum(path);
                if (cur > mx) {
                    mx = cur;
                }
            }

            ans[i - 1][0] = ans[0][i - 1] = base[i - 2] * (mx + 1);
            ans[i - 1][i - 2] = ans[i - 2][i - 1] = base[i - 3] * (mx + 1);
            for (int j = 1; j < i - 2; j++) {
                ans[i - 1][j] = ans[j][i - 1] = base[j - 1] * (mx + 1);
            }
        }

        for (int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static int getSum(int[] path) {
        int sum = 0;
        for (int i = 0; i < path.length; i++) {
            sum += ans[path[i]][path[i + 1]];
        }
        return sum;
    }

    static List<int[]> getPermutations(int n) {
        List<int[]> perms = new ArrayList<>();
        if (n == 0) {
            perms.add(new int[]{});
            return perms;
        }
        for (int i = 0; i < n; i++) {
            List<int[]> subPerms = getPermutations(n - 1);
            for (int[] perm : subPerms) {
                for (int j = 0; j <= i; j++) {
                    int[] newPerm = new int[perm.length + 1];
                    System.arraycopy(perm, 0, newPerm, 0, j);
                    newPerm[j] = i;
                    subPerms.add(newPerm);
                }
            }
            perms.addAll(subPerms);
        }
        return perms;
    }
}
```</s>
