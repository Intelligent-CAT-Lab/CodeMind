<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
2


```
print( int(input()) // 3)

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = n / 3;
        System.out.println(result);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `int()` method is used to convert the input string to an integer.
* The `//` operator is used to perform integer division.
* The result is then printed to the console using `System.out.println()`.

Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the user. The `int()` method is used to convert the input string to an integer. The `//` operator is used to perform integer division. The result is then printed to the console using `System.out.println()`.</s>
