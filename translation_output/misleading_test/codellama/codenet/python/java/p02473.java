<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
91

```
s = input().split()
print(int(s[0]) - int(s[1]))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into two parts. The `parseInt()` method is used to convert the two parts of the string into integers, and then the subtraction is performed. Finally, the result is printed to the console using `System.out.println()`.</s>
