<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    s = sys.stdin.readline().strip()
    str_list = list(s)
    counter = 0
    for i in range(len(str_list) - 1):
        if str_list[i] != str_list[i + 1]:
            counter += 1
    print(counter)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, converts it into a list of characters, and then counts the number of unique characters in the string. The result is printed to the standard output.<｜end▁of▁sentence｜>
