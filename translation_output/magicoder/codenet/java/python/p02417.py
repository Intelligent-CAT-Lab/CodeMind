<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def count_letters(input_string):
    res = [0] * 26
    for c in input_string:
        if 'A' <= c <= 'Z':
            res[ord(c) - ord('A')] += 1
        elif 'a' <= c <= 'z':
            res[ord(c) - ord('a')] += 1
    return res

def print_results(res):
    for i in range(26):
        print(chr(i + ord('a')) + " : " + str(res[i]))

def main():
    res = [0] * 26
    for line in sys.stdin:
        res = [x + y for x, y in zip(res, count_letters(line))]
    print_results(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads lines from the standard input, counts the occurrences of each letter (both lowercase and uppercase), and then prints the results. The `count_letters` function counts the occurrences of each letter in a string, and the `print_results` function prints the results. The `main` function reads lines from the standard input, counts the occurrences of each letter in each line, and then prints the results.<｜end▁of▁sentence｜>
