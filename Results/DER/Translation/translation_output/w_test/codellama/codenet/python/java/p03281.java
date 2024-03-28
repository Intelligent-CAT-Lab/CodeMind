<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
105

Expected output:
1


```
n = int(input())

def cnt_divisor(n):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:
            cnt += 1
    return cnt

cnt = 0
for j in range(1, n+1):
    if j % 2 == 0:
        continue
    if cnt_divisor(j) == 8:
        cnt += 1

print(cnt)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (cntDivisor(i) == 8) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `cntDivisor` method to count the number of divisors of a given number. The `main` method then loops through the numbers from 1 to `n`, skipping even numbers, and for each odd number, it checks if the number of divisors is 8. If it is, it increments the `cnt` variable. Finally, it prints the value of `cnt`.</s>
