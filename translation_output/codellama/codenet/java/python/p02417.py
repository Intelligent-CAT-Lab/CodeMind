<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

res = [0] * 26

for line in sys.stdin:
    for char in line:
        if char.isalpha():
            res[ord(char) - ord('a')] += 1

for i in range(26):
    print(chr(i + ord('a')) + ' : ' + str(res[i]))
```
This code uses the `sys` module to read from standard input, and the `ord` function to get the ASCII code of each character. It then uses the `chr` function to convert the ASCII code back to a character, and the `str` function to convert the count to a string. Finally, it prints the character and its count.</s>
