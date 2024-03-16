<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

class p00375
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a - 30) / 2);
    }

}


```

### 解答

```python
import sys

a = int(sys.stdin.readline())

print((a - 30) / 2)
```

### 解析

1. 使用 ```sys.stdin.readline()``` 读取输入
2. 使用 ```print()``` 打印结果

### 执行结果

```
$ python p00375.py
30
15
```

### 参考

1. [https://www.jianshu.com/p/81999989988f](https://www.jianshu.com/p/81999989988f)
</s>
