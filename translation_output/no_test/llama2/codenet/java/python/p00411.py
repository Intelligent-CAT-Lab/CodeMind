<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```

### 解答

```python
import java.util

def main():
    a = int(input())
    t = int(input())
    r = int(input())
    print(r * t / a)

main()
```

### 解析

1. 将输入转换为整数
2. 计算结果
3. 输出结果

### 总结

1. 使用 `import` 语句导入包
2. 使用 `Scanner` 类读取输入
3. 使用 `System.out.println` 输出结果
4. 使用 `close` 关闭输入流

### 参考

1. [Java 读取输入](https://www.cnblogs.com/xiaohuochai/p/5794999.html)
2. [Java 输出输入](https://www.cnblogs.com/xiaohuochai/p/5794999.html)
</s>
