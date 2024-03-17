Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0:
1: 0
2: 1
3: 0 1
4: 2
5: 0 2
6: 1 2
7: 0 1 2
8: 3
9: 0 3
10: 1 3
11: 0 1 3
12: 2 3
13: 0 2 3
14: 1 2 3
15: 0 1 2 3


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

### Response:
```java
import java.util.*;

public class Bitset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).append(":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append(" ").append(j);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
```<|endoftext|>
