<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
print("ai1333" + "3" * int(int(input()) / 100))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "ai1333" + "3".repeat(input / 100);
        System.out.println(output);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `repeat()` method is used to repeat a string a certain number of times. In this case, we are repeating the string "3" the number of times equal to the input divided by 100.
* The `println()` method is used to print the output to the console.

Note: The `repeat()` method is a Java 11 feature, so if you are using an earlier version of Java, you will need to use a different method to repeat the string.</s>
