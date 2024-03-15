<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = raw_input()
def f(s):
	for u,v in zip(s,s[1:]):
		if u == v:return 'Bad'
	return 'Good'
print f(s)  
```

### Solution

```java
public class Solution {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(f(s));
    }
    
    public static String f(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }
}
```
</s>
