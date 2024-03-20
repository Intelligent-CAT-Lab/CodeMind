Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
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

The given java code is a simple program that takes a string input from the user and checks if the first four characters of the string are "YAKI". If the condition is true, it prints "Yes" else it prints "No".

In python, we can achieve the same functionality using the `input()` function to take input from the user and the `if` statement to check the condition. Here's the solution:

```python
s = input()
if len(s) < 4:
    print("No")
elif s[:4] == "YAKI":
    print("Yes")
else:
    print("No")
```

In this solution, we first take the input using the `input()` function and store it in the variable `s`. Then we check if the length of the string is less than 4. If it is, we print "No" and return from the function. If the length is greater than or equal to 4, we check if the first four characters of the string are "YAKI". If they are, we print "Yes". If not, we print "No".<|endoftext|>
