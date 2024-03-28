<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-29.561930693928545

```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double hen = L / 3.0;
        System.out.println(Math.pow(hen, 3));
    }
}
```</s>
