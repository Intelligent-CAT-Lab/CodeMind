<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0


```
import collections
n=int(input())
cnt=[]
for x in range(1,101):
  for y in range(1,101):
    for z in range(1,101):
      a=x**2+y**2+z**2+x*y+y*z+z*x
      if a<=n:
        cnt.append(a)
c=collections.Counter(cnt)
for i in range(1,n+1):
  print(c[i])
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> cnt = new ArrayList<>();
        for (int x = 1; x < 101; x++) {
            for (int y = 1; y < 101; y++) {
                for (int z = 1; z < 101; z++) {
                    int a = (int) Math.pow(x, 2) + (int) Math.pow(y, 2) + (int) Math.pow(z, 2) + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.add(a);
                    }
                }
            }
        }
        Map<Integer, Integer> c = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            c.put(i, cnt.stream().filter(x -> x == i).count());
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(c.get(i));
        }
    }
}
```</s>
