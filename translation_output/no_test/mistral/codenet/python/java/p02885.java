<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int diff = A - B * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}
```</s>
