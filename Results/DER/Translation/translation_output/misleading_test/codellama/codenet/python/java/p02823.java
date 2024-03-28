<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
-61

```
N,A,B = map(int,input().split())
if (A-B)%2==0:
  print((B-A)//2)
else:
  print(min(A-1,N-B)+1+(B-A)//2)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ((A-B)%2==0) {
            System.out.println((B-A)/2);
        } else {
            System.out.println(Math.min(A-1, N-B)+1+(B-A)/2);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.min()` method to find the minimum of two numbers. The `if` statement checks if the difference between `A` and `B` is even, and if it is, it prints the difference divided by 2. If the difference is odd, it prints the minimum of `A-1` and `N-B` plus 1, plus the difference divided by 2.</s>
