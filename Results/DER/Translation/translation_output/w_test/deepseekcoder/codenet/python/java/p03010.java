<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] base = {1, 2, 4, 7, 12, 20, 29, 38, 52, 73};

        int[][] ans = new int[n][n];
        ans[1][0] = ans[0][1] = 1;

        for (int vn = 3; vn <= n; vn++) {
            int mx = 0;
            List<Integer> path = new ArrayList<>();
            for (int i = 0; i < vn - 1; i++) {
                path.add(i);
            }
            do {
                int cur = 0;
                for (int i = 0; i < path.size() - 1; i++) {
                    cur += ans[path.get(i)][path.get(i + 1)];
                }
                if (cur > mx) {
                    mx = cur;
                }
            } while (nextPermutation(path));

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

    private static boolean nextPermutation(List<Integer> a) {
        int n = a.size();
        int i = n - 2;
        while (i >= 0 && a.get(i) >= a.get(i + 1)) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = n - 1;
        while (j > i && a.get(j) <= a.get(i)) {
            j--;
        }
        Collections.swap(a, i, j);
        Collections.reverse(a.subList(i + 1, n));
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the maximum value for each possible path of length `n`, and then prints the results. The `nextPermutation` method is used to generate all possible permutations of a list.
<|EOT|>
