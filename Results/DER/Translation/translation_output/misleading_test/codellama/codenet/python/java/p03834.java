<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear

```
s = input()
print(s.replace(",", " "))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");
        String output = "";
        for (int i = 0; i < words.length - 1; i++) {
            output += words[i] + " ";
        }
        output += words[words.length - 1];
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into an array of words. The `for` loop then iterates over the array and concatenates each word with a space character, except for the last word which is concatenated without a space character. Finally, the output is printed to the console.

Note that this code assumes that the input string will always be in the format "word1,word2,word3,...", and that there will always be at least two words in the input string. If the input string is in a different format or if there is only one word in the input string, the code may not produce the expected output.</s>
