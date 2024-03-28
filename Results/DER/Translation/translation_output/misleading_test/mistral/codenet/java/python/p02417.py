<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

res = [0] * 26

for line in sys.stdin:
    for char in line:
        if char.isalpha() and char.isupper():
            res[char.isupper() - 65] += 1
        elif char.isalpha() and char.islower():
            res[char.islower() - 97] += 1

for i, count in enumerate(res):
    print(chr(i + 97), ":", count)
```</s>
