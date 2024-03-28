<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> vs = new ArrayList<>();
            for (int v = 0; v < n; v++) {
                if ((i & (1 << v)) > 0) {
                    vs.add(v);
                }
            }
            System.out.println(i + ":" + String.join(" ", vs.toString()));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then generates all subsets of a set with that many elements. For each subset, it prints the index and the elements of the subset.<｜end▁of▁sentence｜>
