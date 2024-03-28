<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, c = map(int, raw_input().split())
t = 0
for loop in xrange(61):
    if t % 60 <= c <= t % 60 + a:
        print t / 60 * 60 + c
        break
    t += a + b
else:
    print -1

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                break;
            }
            t += a + b;
        }
        if (loop == 61) {
            System.out.println(-1);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `for` loop to iterate over the range of values from 0 to 60. The `if` statement checks if the current time `t` is within the range of the current minute and the next minute, and if so, it prints the current time and breaks out of the loop. If the loop completes without finding a match, it prints -1.</s>
