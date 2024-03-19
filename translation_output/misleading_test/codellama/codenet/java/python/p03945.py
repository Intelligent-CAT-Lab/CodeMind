<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    str = list(s)
    counter = 0
    for i in range(len(str) - 1):
        if str[i] != str[i + 1]:
            counter += 1
    print(counter)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, splits it into a list of characters, and then iterates over the list to count the number of adjacent characters that are not equal. The final count is then printed to standard output.

Note that in Python, we can use the `list()` function to convert a string into a list of characters, and we can use the `range()` function to iterate over the indices of a list. Additionally, we can use the `strip()` method to remove any trailing newline characters from the input string.</s>
