<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03697 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a + b >= 10) {
    		System.out.println("error"); 
		}
		else {
		    System.out.println(a + b);
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
    if a + b >= 10:
        print("error")
    else:
        print(a + b)

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03696](https://leetcode-cn.com/problems/translate-java-code-to-python-2/)
</s>
