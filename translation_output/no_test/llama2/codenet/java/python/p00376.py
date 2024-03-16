<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```

### 解答

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

print(abs(a-b))
```

### 解析

1. 使用 ```sys.stdin``` 读取输入
2. 使用 ```abs``` 函数计算绝对值
3. 使用 ```print``` 打印结果

### 执行

```bash
$ python p00376.py
```

### 结果

```bash
$ python p00376.py
1
```

### 参考

1. [Python 3.8.2 Documentation](https://docs.python.org/3/library/functions.html#abs)
</s>
