<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
4VC1!0

```
s = str(input())
print("ABC"+s)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "ABC" + input;
        System.out.println(output);
    }
}
```
This code first reads a line of input from the user using the `Scanner` class. It then converts the input to a string using the `str()` method, and concatenates it with the string "ABC" using the `+` operator. Finally, it prints the resulting string to the console using the `System.out.println()` method.

Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print output to the console. These are both standard Java classes and methods that are commonly used in Java programming.</s>
