<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
3
2 1 2
2 3 1
2 2 3

```
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

```

### Response:
```python
import sys

def main():
    N = int(sys.stdin.readline().strip())
    l = 1
    while N - l >= l:
        N -= l
        l += 1
    if N != l:
        print("No")
        return
    print("Yes")
    print(l + 1)
    answer = [[0] * l for _ in range(l + 1)]
    Index = 1
    for i in range(l + 1):
        print(l, end='')
        for j in range(i):
            print(' ', l, answer[j][i - 1], sep='', end='')
        for j in range(i, l):
            print(' ', l, answer[i][j] := Index, sep='', end='')
            Index += 1
        print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it can be represented as the sum of consecutive integers starting from 1, and if so, prints the representation. If the input integer cannot be represented in this way, it prints "No".
<|EOT|>
