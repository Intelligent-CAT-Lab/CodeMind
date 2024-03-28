<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
0


```
n = int(input())
cnt = [1] * 101
for i in range(2, n+1):
    for j in range(2, n+1):
        while i % j == 0:
            i /= j
            cnt[j] += 1

san = 0; go = 0; jugo = 0; nijugo = 0; shitigo = 0
for i in range(2, 101):
    if cnt[i] >= 3: san += 1
    if cnt[i] >= 5: go += 1
    if cnt[i] >= 15: jugo += 1
    if cnt[i] >= 25: nijugo += 1
    if cnt[i] >= 75: shitigo += 1

print(shitigo + nijugo*(san-1) + jugo*(go-1) + go*(go-1)//2*(san-2))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[101];
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                while (i % j == 0) {
                    i /= j;
                    cnt[j]++;
                }
            }
        }

        int san = 0, go = 0, jugo = 0, nijugo = 0, shitigo = 0;
        for (int i = 2; i <= 100; i++) {
            if (cnt[i] >= 3) san++;
            if (cnt[i] >= 5) go++;
            if (cnt[i] >= 15) jugo++;
            if (cnt[i] >= 25) nijugo++;
            if (cnt[i] >= 75) shitigo++;
        }

        System.out.println(shitigo + nijugo * (san - 1) + jugo * (go - 1) + go * (go - 1) / 2 * (san - 2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, counts the number of times each number from 2 to the input number is a factor of the input number, and then calculates the number of combinations based on the counts.<｜end▁of▁sentence｜>
