<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0
1:v 0
N2: 1
k?@Iz)
4 2
eC -}Q
6: 1 2
g<L'-QJK
8:L 3
9:: 0 3
10: 13
11x: 0 1 3
1l2: 2 3
jU; IY2 3
4: 1 2 3
15: 0 1 2 

```
#!/usr/bin/env python3
# Bitset 2 - Enumeration of Subsets 1


def subset(n):
    for i in range(2**n):
        yield [v for v in range(n) if i & (1 << v) > 0]


def run():
    n = int(input())

    for i, vs in enumerate(subset(n)):
        print("{}:{}".format(i, "".join([" {}".format(v) for v in vs])))


if __name__ == '__main__':
    run()


```
[/INST]
```java
import java.util.*;

public class Bitset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(j);
                }
            }
            subsets.add(subset);
        }
        for (int i = 0; i < subsets.size(); i++) {
            System.out.println("{}:{}".formatted(i, subsets.get(i)));
        }
    }
}
```</s>
