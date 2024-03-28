<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def main():
    N = int(input())
    l = 1
    while N > l:
        N -= l
        l += 1
    if N != l:
        print("No")
        return
    print("Yes")
    print(l+1)
    answer = [[0]*l for _ in range(l+1)]
    Index = 1
    for i in range(l+1):
        string = str(l)
        for j in range(i):
            string += " " + str(answer[j][i-1])
        for j in range(i, l):
            string += " " + str(Index)
            answer[i][j] = Index
            Index += 1
        print(string)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then it calculates the value of `l` and `N`, and checks if `N` is equal to `l`. If not, it prints "No". If `N` is equal to `l`, it prints "Yes" and `l+1`. Then it creates a 2D list `answer` and fills it with numbers from `1` to `N`. Finally, it prints the elements of `answer` in the required format.<｜end▁of▁sentence｜>
