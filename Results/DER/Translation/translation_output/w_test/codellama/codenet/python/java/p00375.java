<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
68

Expected output:
19


```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```
This code first prompts the user to enter a number, then it converts the input to an integer using the `nextInt()` method of the `Scanner` class. It then calculates the value of `y` by subtracting 30 from the input and dividing the result by 2. Finally, it prints the value of `y` to the console using the `println()` method of the `System` class.

Note that the `nextInt()` method of the `Scanner` class returns an integer, so we don't need to explicitly convert the input to an integer using the `int()` method.</s>
