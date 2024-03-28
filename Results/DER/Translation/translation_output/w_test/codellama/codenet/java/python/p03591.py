<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
Yes


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

Here is the Python code that translates the Java code:
```
import java.util.Scanner;

public class p03591:
    def main(self, args):
        sc = Scanner(System.in)

        s = sc.next()
        if s.length() < 4:
            System.out.println("No")
            return
        s2 = s.substring(0, 4)
        if s2.equals("YAKI"):
            System.out.println("Yes")
        else:
            System.out.println("No")

```
Note that the Python code is not exactly the same as the Java code, as Python does not have the same syntax and structure as Java. However, the logic and functionality of the code are the same.</s>
