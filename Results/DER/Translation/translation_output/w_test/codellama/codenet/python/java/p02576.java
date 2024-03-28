<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
12


```
N,X,T= map(int,input().split())
if N%X != 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer value from the user.
* The `map()` method is used to convert the input string to an integer array.
* The `if` statement is used to check if the number of eggs is divisible by the number of boxes. If it is not divisible, then the number of eggs is rounded up to the nearest multiple of the number of boxes and the number of boxes is added to the total number of eggs. If it is divisible, then the number of eggs is rounded down to the nearest multiple of the number of boxes.
* The `System.out.println()` method is used to print the result to the console.</s>
