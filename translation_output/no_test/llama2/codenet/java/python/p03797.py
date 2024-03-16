<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03797{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong(),M=sc.nextLong(),sum=0;
			if(N*2>M){
			sum=M/2;
			}
			else if(M>N*2){
			sum=N;
			sum=sum+((M-N*2)/4);
			}
			System.out.println(sum);
	}
}
```

### 解题思路

```python
import java.util

class p03797:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        N = sc.nextLong()
        M = sc.nextLong()
        sum = 0
        if N * 2 > M:
            sum = M / 2
        elif M > N * 2:
            sum = N
            sum = sum + (M - N * 2) / 4
        else:
            sum = N
        print(sum)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03796](https://leetcode-cn.com/problems/p03796/)
</s>
