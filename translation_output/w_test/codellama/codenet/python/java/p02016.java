<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ani

Expected output:
square1001


```
print('square1001' if input()=='ani' else 'e869120')


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("ani")) {
            System.out.println("square1001");
        } else {
            System.out.println("e869120");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `equals()` method is used to compare the input with the string "ani".
* If the input is equal to "ani", the string "square1001" is printed. Otherwise, the string "e869120" is printed.

Note: The `Scanner` class is used instead of `System.in` because it provides more functionality and is more convenient to use.</s>
