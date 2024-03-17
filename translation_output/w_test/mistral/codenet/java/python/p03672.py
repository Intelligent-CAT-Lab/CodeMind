<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
s = input()
s1 = ""
s2 = ""
answer = ""

for i in range(len(s)-2, -1, -2):
    s1 = s[:i]
    s2 = s[i:]
    if s1 == s2 and len(s) != len(s1):
        answer = s
        break

print(len(answer))
```</s>
