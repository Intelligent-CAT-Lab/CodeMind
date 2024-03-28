<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
3


```
L, R, d = map(int, input().split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and then it uses a `for` loop to iterate over the range of numbers from `L` to `R`, and checks if each number is divisible by `d`. If it is, it increments the `ans` variable. Finally, it prints the value of `ans`.

Here's a sample test case:
```
Input:
5 10 2

Output:
3
```
This test case will produce the expected output of `3`, since there are 3 numbers in the range from 5 to 10 that are divisible by 2: 5, 10, and 8.</s>
