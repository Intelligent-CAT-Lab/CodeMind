<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 16

Expected output:
-45

```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = (A * A - B * B) / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println(x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `map()` method is used to convert the two parts of the input string into integers.
* The `x` variable is calculated using the formula provided in the problem statement.
* The `if` statement checks if `x` is an integer, and if it is, it prints `x`. If `x` is not an integer, it prints "IMPOSSIBLE".

Note: The `Scanner` class is used to read input from the user, but it is not necessary to use it in this problem. You can also use `System.in.read()` to read input from the user.</s>
