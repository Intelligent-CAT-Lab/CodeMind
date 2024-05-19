System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
l = int(input())

d = max([d for d in range(30) if 2**d <= l])
n = d+1
m = 2*d
ans = []
for i in range(1, n):
    ans.append((i, i+1, 0))
    ans.append((i, i+1, 2**(i-1)))

while l > 2**d:
    for i in range(n-1, 0, -1):
        if l-2**(i-1) > 2**d-1:
            ans.append((i, n, l-2**(i-1)))
            m += 1
            l -= 2**(i-1)
            break

print(n, m)
for a in ans:
    print(*a)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int d = 0;
        while (Math.pow(2, d) <= l) {
            d++;
        }
        d--;
        int n = d + 1;
        int m = 2 * d;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(Arrays.asList(i, i + 1, 0));
            ans.add(Arrays.asList(i, i + 1, (int) Math.pow(2, i - 1)));
        }

        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans.add(Arrays.asList(i, n, l - (int) Math.pow(2, i - 1)));
                    m++;
                    l -= (int) Math.pow(2, i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (List<Integer> a : ans) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
