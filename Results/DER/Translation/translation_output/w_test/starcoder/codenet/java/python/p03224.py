<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    N = int(sys.stdin.readline())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N!= l:
        print("No")
        return
    print("Yes")
    print(l+1)
    answer = [[0 for i in range(l)] for j in range(l)]
    Index = 1
    for i in range(l):
        string = str(l)
        for j in range(i):
            string += " " + str(answer[j][i-1])
        for j in range(i, l):
            string += " " + str(answer[i][j] = Index)
            Index += 1
        print(string)

if __name__ == "__main__":
    main()
```
<|endoftext|>
