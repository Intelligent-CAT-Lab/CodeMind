<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
-60

```
H,R = map(int,input().split())

if H>=0:
    print(1)
elif  H<0:
    if H+R>0:
        print(1)
    elif H+R==0:
        print(0)
    else:
        print(-1)
        


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int R = sc.nextInt();
        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0 && H + R > 0) {
            System.out.println(1);
        } else if (H < 0 && H + R == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check the value of `H` and print the appropriate output.
* The `else if` statement is used to check if `H` is less than 0 and `H + R` is greater than 0, and print the appropriate output.
* The `else` statement is used to print the appropriate output if none of the previous conditions are met.

Note: The `map()` function in Python is not needed in Java, as the `Scanner` class can directly read integers from the user.</s>
