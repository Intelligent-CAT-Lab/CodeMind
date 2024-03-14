<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())

if N % 2 == 0:
    edge = []
    for s in range(1, N + 1):
        ng = N - s + 1
        for t in range(1, N + 1):
            if s >= t or t == ng:
                continue
            edge.append((s, t))
else:
    edge = []
    for s in range(1, N + 1):
        ng = N - s
        for t in range(1, N + 1):
            if s >= t or t == ng:
                continue
            edge.append((s, t))

print(len(edge))
for s, t in edge:
    print(s, t)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            int[][] edge = new int[N * (N - 1) / 2][2];
            int idx = 0;
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) continue;
                    edge[idx++] = new int[]{s, t};
                }
            }
            System.out.println(edge.length);
            for (int[] e : edge) System.out.println(e[0] + " " + e[1]);
        } else {
            int[][] edge = new int[N * (N - 1) / 2][2];
            int idx = 0;
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) continue;
                    edge[idx++] = new int[]{s, t};
                }
            }
            System.out.println(edge.length);
            for (int[] e : edge) System.out.println(e[0] + " " + e[1]);
        }
    }
}
```
'''
<|endoftext|>
