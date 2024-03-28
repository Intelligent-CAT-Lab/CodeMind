<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5700

Expected output:
5416

```
print(int(int(input()) // 500 * 500))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = (int) (input / 500) * 500;
        System.out.println(result);
    }
}
```
This code first prompts the user to enter a number, then it reads the input using the `Scanner` class and stores it in the `input` variable.

Next, it calculates the result by dividing the input by 500 and multiplying the result by 500. The result is then stored in the `result` variable.

Finally, the code prints the result to the console using the `System.out.println()` method.

Note that the `int` cast is used to convert the result to an integer before printing it to the console.</s>
