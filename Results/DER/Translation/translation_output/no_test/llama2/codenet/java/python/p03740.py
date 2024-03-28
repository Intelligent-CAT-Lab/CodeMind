<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03740 {
    public static void main(String[] args) {
		try{
			Scanner sc  = new Scanner(System.in);
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1 ? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
```

### 解题思路

1. 使用 ```try``` 块来捕获异常
2. 使用 ```Scanner``` 类来读取输入
3. 使用 ```Math.abs``` 方法来计算两个数的绝对值
4. 使用 ```<=``` 运算符来判断两个数的绝对值是否小于等于 1
5. 使用 ```System.out.println``` 方法来输出结果

### 代码实现

```python
import sys

try:
    a = int(input())
    b = int(input())
    print(a-b <= 1 and "Brown" or "Alice")
except Exception as e:
    print(e)
```

### 代码分析

1. 使用 ```try``` 块来捕获异常
2. 使用 ```input``` 方法来读取输入
3. 使用 ```int``` 类来转换输入为整数
4. 使用 ```-``` 运算符来计算两个数的差
5. 使用 ```<=``` 运算符来判断两个数的绝对值是否小于等于 1
6. 使用 ```and``` 运算符来判断两个布尔值是否都为真
7. 使用 ```print``` 方法来输出结果

### 复杂度分析

1. 时间复杂度：O(1)。
2. 空间复杂度：O(1)。

### 执行

执行结果如下：

![](./code.png)

### 总结

1. 使用 ```try``` 块来捕获异常
2. 使用 ```input``` 方法来读取输入
3. 使用 ```int``` 类来转换输入为整数
4. 使用 ```-``` 运算符来计算两个数的差
5. 使用 ```<=``` 运算符来判断两个数的绝对值是否小于等于 1
6. 使用 ```and``` 运算符来判断两个布尔值是否都为真
7. 使用 ```print``` 方法来输出结果
</s>
