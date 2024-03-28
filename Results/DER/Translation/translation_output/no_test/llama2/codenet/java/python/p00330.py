<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p00330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int W = scan.nextInt();
        
       
        
        
        System.out.println(W*32);
        
    }
}


```

### 解答

```python
import sys

W = int(sys.stdin.readline())

print(W*32)
```

### 解析

1. 使用 ```sys.stdin``` 读取输入
2. 使用 ```int``` 类型转换
3. 使用 ```print``` 打印

### 执行结果

```
10
320
```

### 参考

[https://www.jiuzhang.com/problem/p00330/](https://www.jiuzhang.com/problem/p00330/)
</s>
