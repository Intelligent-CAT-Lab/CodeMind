<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
Ye]s

```
import java.util.*;
import java.util.Scanner;

public class p03591 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    if(s.length() < 4) {
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
    if(s2.equals( "YAKI"))System.out.println("Yes");
    else System.out.println("No");

  }
}

```
[/INST]
```
import java.util.Scanner;

public class p03591 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    if(s.length() < 4) {
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
    if(s2.equals( "YAKI"))System.out.println("Yes");
    else System.out.println("No");

  }
}
```

This is the Java code you provided. To translate it to Python, we can use the `input()` function to get the user's input, and then use the `len()` function to check the length of the input, and the `substring()` function to extract the first 4 characters of the input. Finally, we can use the `print()` function to print the output.

Here's the Python code:
```
s = input("Enter a string: ")
if len(s) < 4:
    print("No")
    return
s2 = s[:4]
if s2 == "YAKI":
    print("Yes")
else:
    print("No")
```
I hope this helps! Let me know if you have any questions.</s>
