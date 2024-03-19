<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
38

```
a = int(input())
print(a + a ** 2 + a ** 3)
```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(a + a * a + a * a * a);
    }
}
```
This code takes an integer `a` as input from the command line, and then prints the sum of `a`, `a` squared, and `a` cubed.

Here's an example of how to run this code:
```
$ java Main 2
38
```
This will print `38`, which is the expected output for the input `2`.</s>
