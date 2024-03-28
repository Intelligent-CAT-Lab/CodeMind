<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abaababaab

Expected output:
6


```
import java.util.Scanner;

public class p03672 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		String s1 = "";
		String s2 = "";
		
		String answer ="";
		
		
		
		for(int i = s.length();i>=2;i=i-2){
			String S = s.substring(0,i);
			
			s1 = S.substring(0, S.length()/2);
			s2 = S.substring(S.length()/2, S.length());
			
			
			if(s1.equals(s2)&&S.length()!=s.length()){
				answer =S;
				break;
			}
			
		}
		
		
		
		System.out.println(answer.length());
		
		
	}

}

```

### Response:
```python
def find_substring(s):
    for i in range(len(s), 0, -2):
        sub = s[0:i]
        s1 = sub[0:len(sub)//2]
        s2 = sub[len(sub)//2:len(sub)]
        if s1 == s2 and len(sub) != len(s):
            return len(sub)
    return 0

s = input()
print(find_substring(s))
```

This Python code does the same thing as the Java code. It reads a string from the input, finds the longest substring that is the same in the beginning and end, and then returns the length of that substring. If no such substring is found, it returns 0.
<|EOT|>
