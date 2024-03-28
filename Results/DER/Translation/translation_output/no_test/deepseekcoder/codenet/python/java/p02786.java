<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

def atack(tairyoku):
    if tairyoku == 1:
        return 1
    else:
        return 1 + atack(int(tairyoku/2)) * 2

H = int(input())

ans = atack(H)

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int ans = attack(H);
        System.out.println(ans);
    }

    public static int attack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + attack(tairyoku / 2) * 2;
        }
    }
}
```
<|EOT|>
