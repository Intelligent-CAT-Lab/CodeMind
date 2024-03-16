<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import sys

a, b = sys.stdin.readline().split()

if a == b:
    print("H")
else:
    print("D")
```
This code reads two strings from standard input using the `sys.stdin.readline()` method, and then checks if they are equal using the `==` operator. If they are equal, it prints "H", otherwise it prints "D".</s>
