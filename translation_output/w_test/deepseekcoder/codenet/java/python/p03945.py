<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


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

def count_changes(s):
    counter = 0
    for i in range(len(s)-1):
        if s[i] != s[i+1]:
            counter += 1
    return counter

s = sys.stdin.readline().strip()
print(count_changes(s))
```

In this Python code, we define a function `count_changes` that takes a string `s` as input and returns the number of changes needed to make the string alternating between 'B' and 'W'. We then read the input string from the standard input, call the `count_changes` function with the input string as argument, and print the result.
<|EOT|>
