<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abaababaab

Expected output:
80

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
def find_length(s):
    s1 = ""
    s2 = ""
    answer = ""
    for i in range(len(s), 1, -2):
        S = s[0:i]
        s1 = S[0: len(S)//2]
        s2 = S[len(S)//2: len(S)]
        if s1 == s2 and len(S) != len(s):
            answer = S
            break
    return len(answer)

# Test input
print(find_length("abaababaab"))
```

This Python code does the same thing as the Java code. It finds the longest substring in the input string that is the same in the first half and the second half. The length of this substring is then returned.
<|EOT|>
