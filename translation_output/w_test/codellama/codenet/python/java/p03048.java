<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
4


```
R, G, B, n = map(int, input().split())
cnt = 0
for r in range(n//R+1):
    for g in range((n-r*R)//G+1):
        b = (n-r*R-g*G)//B
        if r * R + g * G + b * B == n:
            cnt += 1

print(cnt)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for (int r = n/R+1; r >= 0; r--) {
            for (int g = (n-r*R)/G+1; g >= 0; g--) {
                int b = (n-r*R-g*G)/B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses a nested `for` loop to iterate over the possible values of `r` and `g`. The `b` variable is calculated using the formula `b = (n-r*R-g*G)/B`, and the `if` statement checks if the sum of `r`, `g`, and `b` is equal to `n`. If it is, the `cnt` variable is incremented. Finally, the `cnt` variable is printed to the console.</s>
