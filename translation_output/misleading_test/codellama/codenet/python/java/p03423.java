<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
-66

```
print( int(input()) // 3)

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input / 3;
        System.out.println(result);
    }
}
```
This code reads an integer from the user using the `Scanner` class, and then divides it by 3 using the `/` operator. The result is then printed to the console using the `System.out.println()` method.

Note that in Java, the `/` operator is used for integer division, which means that the result will be truncated to an integer. If you want to perform floating-point division, you can use the `/` operator with floating-point numbers, or you can use the `Math.floor()` method to round the result down to the nearest integer.</s>
