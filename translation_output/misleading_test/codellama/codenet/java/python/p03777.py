<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
H H

Expected output:
H

```
import java.util.*;

public class p03777{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if(a.equals(b)){
      System.out.println("H");
    }else{
      System.out.println("D");
    }
  }
}

```
[/INST]
```
import java.util.Scanner;

public class p03777 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if (a.equals(b)) {
      System.out.println("H");
    } else {
      System.out.println("D");
    }
  }
}
```

Here's the Python code:
```
import sys

a, b = sys.stdin.readline().split()

if a == b:
    print("H")
else:
    print("D")
```
Note that the `sys.stdin.readline()` method reads a line from the standard input, and the `split()` method splits the line into a list of strings using whitespace as the delimiter. The `a` and `b` variables are then assigned the first and second elements of the list, respectively. The rest of the code is the same as the Java code.</s>
