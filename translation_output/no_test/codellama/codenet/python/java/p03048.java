<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

R, G, B, n = map(int, input().split())
cnt = 0
for r in range(n//R+1):
    for g in range((n-r*R)//G+1):
        b = (n-r*R-g*G)//B
        if r * R + g * G + b * B == n:
            cnt += 1

print(cnt)

Translate the above python code to java.

java code:

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

        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and it uses a nested `for` loop to iterate over the possible values of `r`, `g`, and `b`. The `if` statement checks if the current values of `r`, `g`, and `b` satisfy the equation `r * R + g * G + b * B == n`, and if they do, it increments the `cnt` variable. Finally, it prints the value of `cnt` to the console.</s>
