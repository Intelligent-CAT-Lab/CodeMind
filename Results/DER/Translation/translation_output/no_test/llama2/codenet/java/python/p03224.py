<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解题思路

```python
import java.util

class p03224:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        N = sc.nextInt()
        l = 1
        for l in range(1, N):
            N -= l
        if N != l:
            print("No")
            return
        print("Yes")
        print(l + 1)
        answer = [[] for _ in range(l + 1)]
        Index = 1
        for i in range(l + 1):
            string = ""
            string += str(l)
            j = 0
            for _ in range(i):
                string += " "
                string += str(answer[j][i - 1])
            for _ in range(l - i):
                string += " "
                string += str(answer[i][j] = Index)
            print(string)

```

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(N)。

### 相关题目

- [p03223](https://leetcode-cn.com/problems/p03223/)
</s>
