<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15 40

Expected output:
-56

```
m,d = map(int,input().split())
ans = 0
for i in range(22,d+1):
  d0 = i%10
  d1 = int(i/10)
  if d0 == 1 or d0 == 0:
    continue
  if m >= d0 * d1:
    ans += 1
    #print(i)
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. It then uses a `for` loop to iterate over the range of numbers from 22 to the input number, and checks if the current number is a valid date by checking if the day is not 1 or 0, and if the month is greater than or equal to the day multiplied by the number of days in the month. If the current number is a valid date, it increments the `ans` variable. Finally, it prints the value of `ans` to the console.</s>
