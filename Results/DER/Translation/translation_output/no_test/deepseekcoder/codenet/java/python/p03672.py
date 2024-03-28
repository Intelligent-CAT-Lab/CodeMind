<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    s = sys.stdin.readline().strip()

    s1 = ""
    s2 = ""

    answer = ""

    for i in range(len(s), 1, -2):
        S = s[0:i]

        s1 = S[0: len(S) // 2]
        s2 = S[len(S) // 2: len(S)]

        if s1 == s2 and len(S) != len(s):
            answer = S
            break

    print(len(answer))

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads a string from the standard input, then it checks every substring of the string from the end to the beginning, and if it finds a substring that is the same in the first half and the second half, it prints the length of that substring and stops. If no such substring is found, it prints 0.
<|EOT|>
