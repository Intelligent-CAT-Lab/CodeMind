<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def p03672():
    s = input()
    s1 = ""
    s2 = ""
    answer = ""
    for i in range(len(s)-2, -1, -2):
        S = s[:i]
        s1 = S[:len(S)//2]
        s2 = S[len(S)//2:]
        if s1 == s2 and len(S) != len(s):
            answer = S
            break
    print(len(answer))

if __name__ == "__main__":
    p03672()
```</s>
