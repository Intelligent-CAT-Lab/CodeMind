<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
import sys

sr = lambda: sys.stdin.readline().rstrip()
ir = lambda: int(sr())
lr = lambda: list(map(int, sr().split()))

L = ir()
edges = []
length = L.bit_length()
for i in range(1, length):
    edges.append((i, i+1, 2**(i-1)))
    edges.append((i, i+1, 0))

# 2**(length-1)-1ã¾ã§ã®æ°ã¯å®äº
# Lã«è¿ãåãç«¯ããå¦çãã¦ãã
for i in range(length-1):
    if L >> i & 1:
        L -= 2 ** i
        edges.append((i+1, length, L))

print(length, len(edges))
for x in edges:
    print(*x)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int length = (int) Math.ceil(Math.log(L) / Math.log(2));
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = 2;
        }
        int index = length - 1;
        while (L > 0) {
            if ((L & 1) == 1) {
                arr[index]--;
                L -= 2;
            }
            index--;
        }
        System.out.println(length + " " + (length - 1));
        for (int i = 0; i < length - 1; i++) {
            System.out.println(i + " " + (i + 1) + " " + arr[i]);
        }
    }
}
```
<|endoftext|>
