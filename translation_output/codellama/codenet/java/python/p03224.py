<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p03224{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l;
		for(l=1; l<N; l++){
			N -= l;
		}
		if(N != l){
			System.out.println("No");
			System.out.flush();
			return;
		}
		System.out.println("Yes");
		System.out.println(l+1);
		int[][] answer = new int[l+1][l];
		int Index = 1;
		for(int i=0; i<=l; i++){
		StringBuilder string = new StringBuilder();
			string.append(l);
			int j=0;
			for(; j<i; j++){
				string.append(" ");
				string.append(answer[j][i-1]);
			}
			for(; j<l; j++){
				string.append(" ");
				string.append(answer[i][j]=Index++);
			}
			System.out.println(string.toString());
		}
		System.out.flush();
		return;
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

N = int(input())
l = 1
while l < N:
    N -= l
    l += 1
if N != l:
    print("No")
    sys.stdout.flush()
    return
print("Yes")
print(l + 1)
answer = [[0] * l for _ in range(l + 1)]
Index = 1
for i in range(l + 1):
    string = str(l)
    for j in range(i):
        string += " " + str(answer[j][i - 1])
    for j in range(i, l):
        string += " " + str(answer[i][j] = Index)
        Index += 1
    print(string)
sys.stdout.flush()
```
This is the Python code that translates the Java code you provided. It uses the same logic and data structures as the Java code, but with Python syntax.

Note that the `sys.stdout.flush()` calls at the end of the code are not necessary in Python, as the output is automatically flushed at the end of the program.</s>
