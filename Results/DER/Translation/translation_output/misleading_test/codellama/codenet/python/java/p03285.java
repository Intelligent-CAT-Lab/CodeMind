<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
Yesz

```
N = int(input())
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (4*i + 7*j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```
This code uses a nested for loop to iterate over the possible values of `i` and `j` that satisfy the equation `4*i + 7*j == N`. If such a pair is found, the program prints "Yes" and exits. If no such pair is found, the program prints "No".

The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the input stream.

The `for` loop iterates over the possible values of `i` and `j` using the `range()` function. The `if` statement checks if the equation `4*i + 7*j == N` is true. If it is, the program prints "Yes" and exits using the `return` statement. If no such pair is found, the program prints "No" and exits.</s>
