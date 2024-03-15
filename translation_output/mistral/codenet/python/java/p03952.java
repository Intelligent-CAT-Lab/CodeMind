<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N, x = [int(i) for i in input().split()]
import sys

if x == 1 or x == 2*N-1:
    if N != 1:
        print('No')
        sys.exit()
    else:
        print('Yes')
        print(1)
        sys.exit()

smaller = True
if x > N:
    smaller = False
    x = 2*N-x

ans = list(range(2*N-1,N+x-1,-1))+list(range(1,N+x))
if not smaller:
    ans =[2*N - ans[i] for i in range(2*N-1)]

print('Yes')
for i in range(2*N-1):
    print(ans[i])
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> ans = new ArrayList<>();

        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                return;
            } else {
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }

        int smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }

        for (int i = 2 * N - 1; i >= 1; i--) {
            ans.add(i);
        }

        if (!smaller) {
            for (int i = 2 * N - 1; i >= 1; i--) {
                ans.add(2 * N - ans.get(i));
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
```</s>
