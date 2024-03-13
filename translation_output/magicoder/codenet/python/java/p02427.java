<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append(" ").append(j);
                }
            }
            System.out.println(i + ":" + sb.toString().trim());
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then generates all subsets of a set with that many elements. For each subset, it prints the index of the subset and the elements in the subset.<｜end▁of▁sentence｜>
