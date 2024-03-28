<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

s = sys.stdin.readline().strip()

s1 = ""
s2 = ""

answer = ""

for i in range(len(s),1,-2):
	S = s[:i]
	
	s1 = S[:len(S)/2]
	s2 = S[len(S)/2:]
	
	if s1 == s2 and len(S)!= len(s):
		answer = S
		break

print len(answer)
```
<|endoftext|>
