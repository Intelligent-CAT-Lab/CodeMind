<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;

public class PrimeFactors {

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

        int san = 0;
        int go = 0;
        int jugo = 0;
        int nijugo = 0;
        int shitigo = 0;
        for (int i = 2; i <= 100; i++) {
            if (cnt[i] >= 3) {
                san++;
            }
            if (cnt[i] >= 5) {
                go++;
            }
            if (cnt[i] >= 15) {
                jugo++;
            }
            if (cnt[i] >= 25) {
                nijugo++;
            }
            if (cnt[i] >= 75) {
                shitigo++;
            }
        }

        System.out.println(shitigo + nijugo * (san - 1) + jugo * (go - 1) + go * (go - 1) / 2 * (san - 2));
    }
}
```
This is the Java code for the given Python code. It uses the same logic and variables as the Python code, but it is written in Java. The `Scanner` class is used to read input from the user, and the `int[]` array is used to store the count of prime factors for each number. The rest of the code is similar to the Python code, with the only difference being the use of `System.out.println()` to print the final result.</s>
