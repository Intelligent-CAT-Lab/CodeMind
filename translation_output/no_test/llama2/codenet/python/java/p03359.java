<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().rstrip().split())
if a>b:
    print(a-1)
else:
    print(a)
```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```

### 解析

1. 使用Scanner类来读取输入
2. 使用if-else语句来判断a和b的大小
3. 使用System.out.println来输出结果

### 总结

1. 使用Scanner类来读取输入
2. 使用if-else语句来判断a和b的大小
3. 使用System.out.println来输出结果

### 参考

1. [Python 3.8.2](https://www.python.org/downloads/release/python-382/)
2. [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
3. [Scanner](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
4. [if-else](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
5. [System.out.println](https://docs.oracle.com/javase/7/docs/api/java/lang/System.html#out)
</s>
