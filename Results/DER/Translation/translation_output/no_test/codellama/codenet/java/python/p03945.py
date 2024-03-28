<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03945{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    int counter=0;
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length-1;i++){
      if(!str[i].equals(str[i+1])){
        counter++;
      }
    }
    System.out.println(counter);
  }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()

str = [s[i] for i in range(len(s))]

counter = 0
for i in range(len(str) - 1):
    if str[i] != str[i + 1]:
        counter += 1

print(counter)
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The rest of the code is similar to the Java code, with the exception of the `range()` function being used instead of the `for` loop with a counter variable.</s>
