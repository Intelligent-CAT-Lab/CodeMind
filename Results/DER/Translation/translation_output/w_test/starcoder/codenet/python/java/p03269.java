<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
3 4
1 2 0
1 2 1
2 3 0
2 3 2

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        while (2<<d <= l) d++;
        int n = d+1;
        int m = 2*d;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            ans.add(i);
            ans.add(i+1);
            ans.add(0);
            ans.add(i);
            ans.add(i+1);
            ans.add(2<<(i-1));
        }
        while (l > 2<<d) {
            for (int i = n-1; i > 0; i--) {
                if (l-2<<(i-1) > 2<<d-1) {
                    ans.add(i);
                    ans.add(n);
                    ans.add(l-2<<(i-1));
                    m += 1;
                    l -= 2<<(i-1);
                    break;
                }
            }
        }
        System.out.println(n+" "+m);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
```
'''
<|endoftext|>
