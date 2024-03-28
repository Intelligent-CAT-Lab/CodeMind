<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
29

```
print(1 - int(input()))
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int result = 1 - input;
        System.out.println(result);
    }
}
```
This code takes an integer input from the command line and prints the result of subtracting 1 from that input. The `Integer.parseInt()` method is used to convert the input string to an integer. The `System.out.println()` method is used to print the result to the console.</s>
