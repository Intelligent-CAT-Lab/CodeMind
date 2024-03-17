<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0


```
print(*divmod(int(input())*2,60))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input * 2;
        int quotient = result / 60;
        int remainder = result % 60;
        System.out.println(quotient + " " + remainder);
    }
}
```
Explanation:

* The `divmod` function in Python is not available in Java, so we need to manually calculate the quotient and remainder.
* We use the `*` operator to unpack the tuple returned by the `divmod` function in Python, and then print the quotient and remainder separately.
* In Java, we use the `Scanner` class to read input from the user, and then use the `nextInt()` method to read an integer from the input.
* We then multiply the input by 2, and then calculate the quotient and remainder using the `/` and `%` operators.
* Finally, we print the quotient and remainder using the `System.out.println()` method.</s>
