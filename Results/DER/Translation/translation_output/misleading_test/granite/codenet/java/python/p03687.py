System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
def min_distance(s):
    ans = 101
    for i in range(26):
        target = chr(ord('a') + i)
        max_dist = 0
        cur_dist = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_dist = 0
            else:
                cur_dist += 1
                max_dist = max(max_dist, cur_dist)
        ans = min(ans, max_dist)
    return ans
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "serval"
expected_output = -56
assert min_distance(test_input) == expected_output
```<|endoftext|>
