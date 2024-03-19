<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
3@NJ'

```
x = input()

if x == "a" or x == "i" or x == "u" or x == "e" or x == "o" :
    print("vowel")
else:
    print("consonant")

```
[/INST]
```java
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("a") || input.equals("i") || input.equals("u") || input.equals("e") || input.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `equals` method is used to compare the input with the vowels.</s>
