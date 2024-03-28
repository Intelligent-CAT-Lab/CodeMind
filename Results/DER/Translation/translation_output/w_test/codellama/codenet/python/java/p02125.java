<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
N = int(input())
ans = 0
x = 1
while 2*x-1 <= N:
    x = 2*x
    ans += 1
print(ans)


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int x = 1;
        while (2*x-1 <= N) {
            x = 2*x;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output.

Here's a sample test case:
```
Input:
2

Output:
1
```
This test case passes the input `2` to the program, which then calculates the number of times the loop runs and prints the result `1`.</s>
