<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
128


```
num = int(input())

print(num * 32)

```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(num * 32);
    }
}
```
This code takes an integer input from the command line and multiplies it by 32. The result is then printed to the console.

Here's an example of how to run the code:
```
$ java Main 4
128
```
This will print the result of 4 * 32, which is 128.</s>
