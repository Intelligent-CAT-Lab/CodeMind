<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p02789{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n, m = map(int, sys.stdin.readline().split())

if n == m:
    print("Yes")
else:
    print("No")
```
In this code, we first import the `sys` module, which provides access to the standard input and output streams. We then use the `map` function to convert the input from the standard input stream into integers. The `map` function takes a function and an iterable as arguments, and applies the function to each element of the iterable. In this case, we use the `int` function to convert each element of the input into an integer.

Next, we assign the first and second integers to the variables `n` and `m`, respectively. We then use an `if` statement to check if `n` is equal to `m`. If they are equal, we print "Yes" to the standard output stream. Otherwise, we print "No".

Note that in Python, we don't need to explicitly close the standard input stream, as it is automatically closed when the program exits.</s>
