System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.BitSet;

public class BitSet2 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < Math.pow(2, n); i++) {
            BitSet bitSet = BitSet.valueOf(new long[]{i});
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if (bitSet.get(j)) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
