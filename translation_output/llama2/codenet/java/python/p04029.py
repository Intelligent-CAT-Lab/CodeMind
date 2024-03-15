<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p04029{

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
    sum = sum + i;
    }
    System.out.println(sum);
  }

}
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
sum = 0
for i in range(1, n+1):
    sum += i
print(sum)
```

### 解析

1. 使用 ```sys.stdin``` 读取输入
2. 使用 ```range``` 读取 ```1``` 到 ```n``` 的值
3. 使用 ```sum``` 加上 ```i``` 的值
4. 使用 ```print``` 打印结果

### 总结

1. 使用 ```sys.stdin``` 读取输入
2. 使用 ```range``` 读取 ```1``` 到 ```n``` 的值
3. 使用 ```sum``` 加上 ```i``` 的值
4. 使用 ```print``` 打印结果

### 参考

1. [Python 3 中的 sys 模块](https://www.cnblogs.com/xiaohuochai/p/5994999.html)
2. [Python 3 中的 range 函数](https://www.cnblogs.com/xiaohuochai/p/5994998.html)
3. [Python 3 中的 sum 函数](https://www.cnblogs.com/xiaohuochai/p/5994997.html)
4. [Python 3 中的 print 函数](https://www.cnblogs.com/xiaohuochai/p/5994996.html)
</s>
