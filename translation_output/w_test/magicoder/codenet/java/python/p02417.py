<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
This is a pen.

Expected output:
a : 1
b : 0
c : 0
d : 0
e : 1
f : 0
g : 0
h : 1
i : 2
j : 0
k : 0
l : 0
m : 0
n : 1
o : 0
p : 1
q : 0
r : 0
s : 2
t : 1
u : 0
v : 0
w : 0
x : 0
y : 0
z : 0


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
Here is the Python version of the given Java code:

```python
import sys

def count_letters(text):
    res = [0] * 26
    for c in text:
        if 'A' <= c <= 'Z':
            res[ord(c) - ord('A')] += 1
        elif 'a' <= c <= 'z':
            res[ord(c) - ord('a')] += 1
    return res

def main():
    res = [0] * 26
    for line in sys.stdin:
        res = [x + y for x, y in zip(res, count_letters(line))]
    for i in range(26):
        print(chr(i + ord('a')) + " : " + str(res[i]))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads lines from the standard input, counts the occurrences of each letter (both lowercase and uppercase), and then prints the counts. The `count_letters` function is used to count the occurrences of letters in a single line of input. The `main` function reads lines from the standard input, counts the occurrences of letters in each line, and then prints the total counts.<｜end▁of▁sentence｜>
