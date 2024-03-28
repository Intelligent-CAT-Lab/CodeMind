<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p03001
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int w=in.nextInt();
		int h=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		double ans=(double)w*(double)h/2;
		int a=0;
		if(x+x==w&&y+y==h)
			a=1;
		System.out.println(ans+" "+a);
	}
}
	
```

### 解答

```python
import sys

w = int(sys.stdin.readline())
h = int(sys.stdin.readline())
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())

ans = (w * h) / 2
a = 0
if x + x == w and y + y == h:
    a = 1

print(ans + " " + str(a))
```

### 解析

1. 读取输入
2. 计算面积
3. 判断是否为正方形
4. 输出结果

### 思路

1. 读取输入
2. 计算面积
3. 判断是否为正方形
4. 输出结果

### 代码

1. 读取输入
2. 计算面积
3. 判断是否为正方形
4. 输出结果

### 总结

1. 读取输入
2. 计算面积
3. 判断是否为正方形
4. 输出结果

### 参考

1. 读取输入
2. 计算面积
3. 判断是否为正方形
4. 输出结果

### 附录

1. 读取输入
2. 计算面积
3. 判断是否为正方形
4. 输出结果
</s>
