<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    s = sys.stdin.readline().strip()
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
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, then iterates over each character in the string. For each character, it counts the number of consecutive occurrences of that character and the maximum number of consecutive occurrences of any other character. The minimum of these maximum counts is stored in the variable `ans`. Finally, it prints the value of `ans`.<｜end▁of▁sentence｜>
