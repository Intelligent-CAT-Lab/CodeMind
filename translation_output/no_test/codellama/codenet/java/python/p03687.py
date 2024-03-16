<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
 
public class p03687{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 101;
		for(int i=0; i<26; i++){
			char target = (char)(i+'a');
			int max=0;
			int cur=0;
			for(int j=0; j<s.length(); ++j){
				if(s.charAt(j)==target) cur = 0;
				else{
					cur++;
					max = Math.max(max, cur);
				}
			}
			ans = Math.min(ans,max);
		}
		
		System.out.println(ans);
		return;
	}
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
ans = 101

for i in range(26):
    target = chr(i + ord('a'))
    max_len = 0
    cur_len = 0
    for j in range(len(s)):
        if s[j] == target:
            cur_len = 0
        else:
            cur_len += 1
            max_len = max(max_len, cur_len)
    ans = min(ans, max_len)

print(ans)
```
This is the Python code that translates the Java code you provided. It uses the `sys` module to read a line from standard input and the `chr` and `ord` functions to convert between characters and their ASCII codes. The rest of the code is similar to the Java code, with a few minor differences in syntax.</s>
