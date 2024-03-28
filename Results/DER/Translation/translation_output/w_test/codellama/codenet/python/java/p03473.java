<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
21

Expected output:
27


```
M = int(input())
print(48-M)
```
[/INST]
```
int M = Integer.parseInt(input());
System.out.println(48-M);
```
This code first reads an integer value from the user using the `input()` function, and then prints the result of subtracting 48 from that value. The `Integer.parseInt()` method is used to convert the input string to an integer. The `System.out.println()` method is used to print the result to the console.</s>
