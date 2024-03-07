<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N = int(input())
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `for` loops are used to iterate over the range of values for `i` and `j`, and the `if` statement is used to check if the condition `4 * i + 7 * j == N` is true. If it is, the program prints "Yes" and exits. If the loop completes without finding a match, the program prints "No".</s>
