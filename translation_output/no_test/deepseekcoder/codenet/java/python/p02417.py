<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02417 {
      
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
         
        int res[]=new int[26];
         
        while(cin.hasNext()) {
            String str=cin.nextLine();
            for(int i=0;i<str.length();i++) {
                char c=str.charAt(i);
                if(c>=65 && c<=90)res[c-65]++;
                else if(c>=97 && c<=122)res[c-97]++;
            }
        }
         
        for(int i=0;i<26;i++) {
            System.out.println((char)(i+97)+" : "+res[i]);
        }
         
    }
     
}

```

### Response:
```python
import sys

def count_letters(res):
    for line in sys.stdin:
        for c in line:
            if 'A' <= c <= 'Z':
                res[ord(c) - ord('A')] += 1
            elif 'a' <= c <= 'z':
                res[ord(c) - ord('a')] += 1
    return res

def print_counts(res):
    for i in range(26):
        print(chr(i + ord('a')) + " : " + str(res[i]))

res = [0]*26
res = count_letters(res)
print_counts(res)
```

This Python code does the same thing as the Java code. It reads lines from the standard input, counts the occurrences of each lowercase and uppercase letter, and then prints the counts. The `count_letters` function does the counting, and `print_counts` prints the counts. The `ord` function is used to convert characters to their ASCII values, and the `chr` function is used to convert ASCII values back to characters.
<|EOT|>
