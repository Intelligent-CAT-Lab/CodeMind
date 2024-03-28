<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3333


```
a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            System.out.println(repeatString(a, b));
        } else {
            System.out.println(repeatString(b, a));
        }
    }

    public static String repeatString(int num, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += num;
        }
        return result;
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read the first integer from the input.
* The `split()` method is used to split the input into two integers.
* The `repeatString()` method is used to repeat the first integer `count` times.
* The `if` statement is used to check if the first integer is less than or equal to the second integer. If it is, the first integer is repeated `count` times. If it is not, the second integer is repeated `count` times.
* The `System.out.println()` method is used to print the result.

Note: The `repeatString()` method is a custom method that I have defined to repeat a string `count` times. It is not a built-in method in Java.</s>
