System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
Here's the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans++;
                //System.out.println(i);
            }
        }
        System.out.println(ans);
    }
}
```

In this Java code, we use the `Scanner` class to read the input values for `m` and `d`. We then initialize the `ans` variable to 0. The `for` loop iterates from 22 to `d`, inclusive. Inside the loop, we calculate the last two digits of `i` using the modulo and division operators. We then check if the last digit is 1 or 0, and if so, we continue to the next iteration of the loop. If the last two digits are valid, we check if `m` is greater than or equal to the product of the last two digits. If it is, we increment the `ans` variable and print the value of `i`. Finally, we print the value of `ans`.<|endoftext|>
