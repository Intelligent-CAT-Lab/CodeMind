<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
a

Expected output:
vowel


```
import java.util.Scanner;

public class  p03852{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextLine();

        if (c.equals("a")) {
            System.out.println("vowel");
        } else if (c.equals("i")) {
            System.out.println("vowel");
        } else if (c.equals("u")) {
            System.out.println("vowel");
        } else if (c.equals("e")) {
            System.out.println("vowel");
        } else if (c.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

}
```
[/INST]
```python
import sys

c = sys.stdin.readline().strip()

if c == "a":
    print("vowel")
elif c == "i":
    print("vowel")
elif c == "u":
    print("vowel")
elif c == "e":
    print("vowel")
elif c == "o":
    print("vowel")
else:
    print("consonant")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `strip()` removes any leading or trailing whitespace from the input.
* The `if` statement checks if the input is equal to any of the vowels, and if so, prints "vowel".
* If the input is not equal to any of the vowels, it is considered a consonant and prints "consonant".

Note: The `elif` statements are used instead of multiple `if` statements to make the code more concise and easier to read.</s>
