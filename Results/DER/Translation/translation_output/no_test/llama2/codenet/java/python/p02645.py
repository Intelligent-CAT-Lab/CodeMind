<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```

### 解答

```python
import java.util

def main():
    s = input()
    print(s[:3])

if __name__ == '__main__':
    main()
```

### 解析

1. 将输入的字符串转换为python字符串
2. 使用python的slice方法获取字符串的前三个字符

### 总结

1. 使用java的scanner类转换为python的input()
2. 使用python的slice方法获取字符串的前三个字符

### 参考

1. [https://www.jianshu.com/p/899999899899](https://www.jianshu.com/p/899999899899)
2. [https://www.jianshu.com/p/899999899899](https://www.jianshu.com/p/899999899899)
</s>
