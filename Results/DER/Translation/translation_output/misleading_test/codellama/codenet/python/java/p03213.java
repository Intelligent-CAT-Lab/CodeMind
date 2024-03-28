<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
83

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
This code first prompts the user to enter a number `n`, and then it initializes an array `cnt` of size 101 to store the number of factors of each number from 2 to 100.

The next step is to iterate over the numbers from 2 to `n` and for each number `i`, iterate over the numbers from 2 to `n` and check if `i` is a factor of `j`. If it is, then increment the corresponding element in the `cnt` array.

After that, the code calculates the number of numbers from 2 to 100 that have at least 3, 5, 15, 25, and 75 factors, respectively.

Finally, the code prints the sum of the number of numbers with at least 75 factors, the number of numbers with at least 25 factors multiplied by the number of numbers with at least 3 factors minus 1, and so on.

Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output.</s>
