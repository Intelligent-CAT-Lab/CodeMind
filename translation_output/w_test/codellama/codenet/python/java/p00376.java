<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 30

Expected output:
10


```
a,b= map(int, input().split())
if a < b:
    print(b-a)
else:
    print(a-b)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two integers.
* The `map()` method is used to convert the input strings to integers.
* The `if` statement is used to check which number is smaller and print the difference between the two numbers.
* The `else` statement is used to print the difference between the two numbers if the first number is not smaller.

Note: The `import` statement is used to import the `Scanner` class from the `java.util` package.</s>
