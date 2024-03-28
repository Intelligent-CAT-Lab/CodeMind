<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
es

```
N=int(input())
for i in range(1,10):
    for j in range(1,10):
        if(i*j==N):
            print('Yes')
            exit()
print('No')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```
This code uses a nested for loop to iterate through the numbers from 1 to 10 and check if any two numbers multiply to the input number. If a match is found, it prints "Yes" and exits the program. If no match is found, it prints "No".

Note that the `return` statement is used to exit the program early if a match is found. This is more efficient than using a `break` statement to exit the loop, as it avoids the overhead of iterating through the rest of the loop.</s>
