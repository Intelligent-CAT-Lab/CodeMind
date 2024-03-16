<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03302{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if(a+b==15){
        	System.out.println("+");
        }else if(a*b==15){
        	System.out.println("*");
        }else{
        	System.out.println("x");
        }
    }
}
```

### 解题思路

```python
import java.util

class p03302:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        if a + b == 15:
            print("+")
        elif a * b == 15:
            print("*")
        else:
            print("x")
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03301](./p03301.md)
</s>
