
```java
import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] ans;
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;
        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            List<List<Integer>> paths = new ArrayList<>();
            for (int i = 0; i < vn - 1; i++) {
                List<Integer> path = new ArrayList<>();
                for (int j = 0; j < vn - 1; j++) {
                    path.add(j);
                }
                paths.add(path);
            }
            for (int i = 0; i < vn - 1; i++) {
                for (int j = i + 1; j < vn - 1; j++) {
                    Collections.swap(paths.get(i), j, i);
                }
            }
            for (List<Integer> path : paths) {
                int cur = 0;
                for (int i = 0; i < path.size() - 1; i++) {
                    cur += ans[path.get(i)][path.get(i + 1)];
                }
                if (cur > mx) {
                    mx = cur;
                }
            }
            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## 2.

### 2.1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
0 6 15
6 0 21

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

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] ans;
    static int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;
        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            List<List<Integer>> paths = new ArrayList<>();
            for (int i = 0; i < vn - 1; i++) {
                List<Integer> path = new ArrayList<>();
                for (int j = 0; j < vn - 1; j++) {
                    path.add(j);
                }
                paths.add(path);
            }
            for (int i = 0; i < vn - 1; i++) {
                for (int j = i + 1; j < vn - 1; j++) {
                    Collections.swap(paths.get(i), j, i);
                }
            }
            for (List<Integer> path : paths) {
                int cur = 0;
                for (int i = 0; i < path.size() - 1; i++) {
                    cur += ans[path.get(i)][path.get(i + 1)];
                }
                if (cur > mx) {
                    mx = cur;
                }
            }
            ans[vn - 1][0] = ans[0][vn - 1] = base[vn - 2] * (mx + 1);
            ans[vn - 1][vn - 2] = ans[vn - 2][vn - 1] = base[vn - 3] * (mx + 1);
            for (int j = 1; j < vn - 2; j++) {
                ans[vn - 1][j] = ans[j][vn - 1] = base[j - 1] * (mx + 1);
            }
        }
        for (int i = 0; i < n; i++) {
           
