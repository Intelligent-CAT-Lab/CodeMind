<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p00290 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(d*c);

    }
}


```

### 解答

```python
import sys

d = int(sys.stdin.readline())
c = int(sys.stdin.readline())
print(d*c)
```

### 解析

1. 使用 ```sys.stdin``` 读取输入
2. 使用 ```print``` 打印结果

### 执行

```shell
$ python p00290.py
```

### 结果

```shell
$ python p00290.py
10
10
```

### 参考

1. [Python 3 中的 sys 模块](https://www.cnblogs.com/xiaohuochai/p/5994999.html)
</s>
