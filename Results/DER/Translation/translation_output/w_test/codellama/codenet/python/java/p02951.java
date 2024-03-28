<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
1


```
A, B, C = map(int, input().split())

get = A - B

i = C - get

if i < 0:
    i = 0
     
print(i)

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
        int get = A - B;
        int i = C - get;
        if (i < 0) {
            i = 0;
        }
        System.out.println(i);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into an array of strings.
* The `map()` method is used to convert the array of strings into an array of integers.
* The `get` variable is used to store the result of the subtraction operation.
* The `i` variable is used to store the result of the subtraction operation.
* The `if` statement is used to check if the result of the subtraction operation is negative, and if it is, the `i` variable is set to 0.
* The `System.out.println()` method is used to print the result of the subtraction operation.</s>
