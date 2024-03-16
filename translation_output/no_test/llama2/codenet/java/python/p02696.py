<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```

### 解题思路

```python
import java.util

def main():
    a = int(input())
    b = int(input())
    n = int(input())
    if n >= b:
        print(a * (b - 1) / b)
    else:
        print(a * n / b)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p02695](https://leetcode-cn.com/problems/p02695/)
</s>
