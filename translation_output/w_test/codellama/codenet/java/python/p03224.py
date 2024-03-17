<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
Yes
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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    N = int(sys.stdin.readline())
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

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `sys` module to read input from stdin and write output to stdout, and the `range` function to generate the required ranges for the loops. The `str` function is used to convert integers to strings, and the `+=` operator is used to concatenate strings.</s>
