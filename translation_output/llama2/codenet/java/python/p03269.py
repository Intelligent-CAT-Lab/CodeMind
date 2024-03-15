<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.PrintWriter;
public class p03269{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int k=l;
		int t=1;
		int count=1;
		ArrayList<String> ans=new ArrayList<>();
		while(l>1){
			if((l & 1)==1){
				k-=t;
				ans.add(count+" "+20+" "+k);
			}
			ans.add(count+" "+(count+1)+" "+t);
			count++;
			l>>=1;
			t*=2;
		}
		System.out.println(20+" "+(ans.size()+19));
		for(int i=0; i<19; i++){
			System.out.println((i+1)+" "+(i+2)+" "+0);
		}
		for(String s:ans){
			System.out.println(s);
		}
	}
}

```

### 解题思路

```python
import java.util
import java.io

class p03269:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        l = sc.nextInt()
        k = l
        t = 1
        count = 1
        ans = []
        while l > 1:
            if (l & 1) == 1:
                k -= t
                ans.append(count + " " + 20 + " " + k)
            ans.append(count + " " + (count + 1) + " " + t)
            count += 1
            l >>= 1
            t *= 2
        print(20 + " " + (ans.size() + 19))
        for i in range(19):
            print(i + 1 + " " + (i + 2) + " " + 0)
        for s in ans:
            print(s)
```

### 复杂度分析

- 时间复杂度：O(logn)。
- 空间复杂度：O(n)。

### 相关题目

- [p03268](https://leetcode-cn.com/problems/p03268/)
</s>
