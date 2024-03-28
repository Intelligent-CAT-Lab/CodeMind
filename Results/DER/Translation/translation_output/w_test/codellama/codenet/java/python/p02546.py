<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
apples


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

In Python, we can use the `endswith()` method to check if a string ends with a specific substring. We can also use the `+` operator to concatenate strings.

Here's the Python code:
```
import sys

s = sys.stdin.readline().strip()
if s.endswith("s"):
    print(s + "es")
else:
    print(s + "s")
```
This code reads a line of input from the user, strips the newline character, and then checks if the string ends with "s". If it does, it prints the string with "es" added to the end. If it doesn't, it prints the string with "s" added to the end.</s>
