<s> Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Alice" + (a - b > 1 ? "" : " Brown"));
    }
}
```

### 解析

1. 使用Scanner类来读取输入
2. 使用if语句判断a-b的值是否大于1
3. 使用String的+运算符来连接字符串

### 总结

1. 使用Scanner类来读取输入
2. 使用if语句判断a-b的值是否大于1
3. 使用String的+运算符来连接字符串

### 参考

1. [Python 3.6.4](https://www.python.org/downloads/release/python-364/)
2. [Java 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
3. [Scanner](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
4. [if语句](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
5. [String的+运算符](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
</s>
