<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
serval

Expected output:
3


```
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
```

### Response:
```python
import sys

def solve(s):
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_val = 0
        cur = 0
        for j in range(len(s)):
            if s[j] == target:
                cur = 0
            else:
                cur += 1
                max_val = max(max_val, cur)
        ans = min(ans, max_val)
    return ans

s = input()
print(solve(s))
```

This Python code does the same thing as the Java code. It reads a string from the input, then iterates over each character in the string. For each character, it counts the maximum number of consecutive characters that are not the same as the current character. The minimum of these maximums is then printed out.
<|EOT|>
