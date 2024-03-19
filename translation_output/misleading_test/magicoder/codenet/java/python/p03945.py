<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
44

```
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
```

@@ Response
```python
s = input()
counter = 0
for i in range(len(s)-1):
    if s[i] != s[i+1]:
        counter += 1
print(counter)
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over the string, incrementing a counter each time it encounters a character that is different from the next character. Finally, it prints the counter.<｜end▁of▁sentence｜>
