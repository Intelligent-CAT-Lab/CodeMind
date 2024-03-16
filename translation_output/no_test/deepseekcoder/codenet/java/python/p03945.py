<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    str_list = [c for c in s]
    counter = 0
    for i in range(len(str_list) - 1):
        if str_list[i] != str_list[i+1]:
            counter += 1
    print(counter)

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads a string from standard input, converts it to a list of characters, and then counts the number of adjacent characters that are different. The result is printed to standard output.
<|EOT|>
