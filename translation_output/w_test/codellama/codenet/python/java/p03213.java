<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
This code is a Java implementation of the Python code provided. It uses the `Scanner` class to read input from the user, and the `int[]` array to store the count of each number. The logic for calculating the number of prime numbers less than or equal to `n` is the same as in the Python code. The only difference is that in Java, we need to use the `import` statement to include the `Scanner` class.</s>
