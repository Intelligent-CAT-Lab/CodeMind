System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
		if(N!= l){
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


Answer:
```python
import sys

def main():
    N = int(input())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N!= l:
        print("No")
        sys.stdout.flush()
        return
    print("Yes")
    print(l + 1)
    answer = [[0] * l for _ in range(l + 1)]
    index = 1
    for i in range(l + 1):
        s = [str(l)]
        for j in range(i):
            s.append(str(answer[j][i - 1]))
        for j in range(i, l):
            s.append(str(answer[i][j] = index))
            index += 1
        print(" ".join(s))
    sys.stdout.flush()

if __name__ == "__main__":
    main()
```<|endoftext|>
