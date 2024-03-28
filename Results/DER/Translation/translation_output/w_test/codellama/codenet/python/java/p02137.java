<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5700

Expected output:
5500


```
print(int(int(input()) // 500 * 500))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = (int) (input / 500) * 500;
        System.out.println(output);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `int` cast is used to convert the input to an integer.
* The `//` operator is used to perform integer division and round down to the nearest integer.
* The `*` operator is used to multiply the result by 500.
* The `int` cast is used to convert the result to an integer.
* The `System.out.println()` method is used to print the output to the console.

Note: The `Scanner` class is used to read input from the user, but it is not necessary to use it in this case. You can also use `System.in.read()` to read input from the user.</s>
