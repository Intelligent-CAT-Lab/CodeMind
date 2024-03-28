<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a > 0 && a < 10 && b > 0 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `parseInt()` method is used to convert the two parts of the input string into integers.
* The `if` statement checks if the two integers are within the required range (0 to 9). If they are, the product of the two numbers is printed. If not, the string "-1" is printed.

Note: The `import` statement is used to import the `Scanner` class from the `java.util` package.</s>
