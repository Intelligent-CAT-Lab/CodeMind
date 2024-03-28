<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
serval

Expected output:
-56

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
[/INST]
```python
s = input()
ans = 101
for i in range(26):
    target = chr(i + ord('a'))
    max = 0
    cur = 0
    for j in range(len(s)):
        if s[j] == target:
            cur = 0
        else:
            cur += 1
            max = max(max, cur)
    ans = min(ans, max)
print(ans)
```</s>
