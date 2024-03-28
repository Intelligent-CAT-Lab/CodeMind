<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

res = [0] * 26

while sys.stdin.isatty():
    str = input()
    for i in range(len(str)):
        c = str[i]
        if 65 <= ord(c) <= 90:
            res[ord(c) - 65] += 1
        elif 97 <= ord(c) <= 122:
            res[ord(c) - 97] += 1

for i in range(26):
    print((chr(i + 97)) + " : " + str(res[i]))
```</s>
