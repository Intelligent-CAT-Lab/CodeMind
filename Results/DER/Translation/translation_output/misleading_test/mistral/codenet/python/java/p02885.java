<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12 4

Expected output:
59

```
# -*- coding: utf-8 -*-

[A, B] = [int(i) for i in input().split()]

diff = A - B * 2
if diff < 0:
    print(0)
else:
    print(diff)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int diff = A - (2 * B);
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}
```</s>
