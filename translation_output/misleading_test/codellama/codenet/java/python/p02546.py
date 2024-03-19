<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
DmdZQr

```
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}

```
[/INST]
```python
import sys

s = input()
if s.endswith("s"):
    print(s + "es")
else:
    print(s + "s")
```
Explanation:

* `import sys` is used to import the `sys` module, which provides access to the standard input and output streams.
* `s = input()` is used to read a string from the standard input stream.
* `if s.endswith("s"):` is used to check if the string ends with the letter "s".
* `print(s + "es")` is used to print the string with an additional "es" at the end, if the string ends with "s".
* `else:` is used to indicate the alternative case, where the string does not end with "s".
* `print(s + "s")` is used to print the string with an additional "s" at the end, if the string does not end with "s".</s>
