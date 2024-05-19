System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
Yes
1
6
3
7
4
5
2


```
N, x = [int(i) for i in input().split()]
import sys

if x == 1 or x == 2*N-1:
    if N!= 1:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        if (x == 1 || x == 2*N-1) {
            if (N!= 1) {
                System.out.println("No");
                System.exit(0);
            } else {
                System.out.println("Yes");
                System.out.println(1);
                System.exit(0);
            }
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2*N-x;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 2*N-1; i >= N+x-1; i--) {
            ans.add(i);
        }
        for (int i = 1; i < N+x; i++) {
            ans.add(i);
        }
        if (!smaller) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 2*N-1; i >= 0; i--) {
                temp.add(ans.get(i));
            }
            ans = temp;
        }

        System.out.println("Yes");
        for (int i = 0; i < 2*N-1; i++) {
            System.out.println(ans.get(i));
        }
    }
}
```<|endoftext|>
