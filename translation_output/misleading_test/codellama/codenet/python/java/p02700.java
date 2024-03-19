<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 9 10 10

Expected output:
No

```
A,B,C,D = map(int,input().split())
while A>0 and C>0:
    C -= B
    if C<=0:
        print("Yes")
        break
    A -= D
    if A<=0:
        print("No")
        break
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `while` loop to iterate over the input. The `if` statements are used to check if the conditions are met, and the `break` statements are used to exit the loop if the conditions are met. The output is printed to the console using `System.out.println()`.</s>
