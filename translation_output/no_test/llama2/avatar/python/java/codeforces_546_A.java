<s> Translate the following python code to java and enclose your solution inside ```java```:
```
k , n , w = map ( int , input ( ) . strip ( ) . split ( ) )
sum = 0
for i in range ( 1 , w + 1 ) :
    sum += k * i
if sum <= n :
    print ( 0 )
else :
    print ( sum - n )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n, w;
        k = Integer.parseInt(sc.nextLine());
        n = Integer.parseInt(sc.nextLine());
        w = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```

### 解析

1. 使用Scanner类来读取输入
2. 使用for循环来计算k*i的和
3. 如果和小于等于n，则输出0
4. 如果和大于n，则输出和减去n

### 总结

1. 使用Scanner类来读取输入
2. 使用for循环来计算k*i的和
3. 如果和小于等于n，则输出0
4. 如果和大于n，则输出和减去n

### 参考

1. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
2. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
3. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
4. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
5. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
6. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
7. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
8. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
9. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
10. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
11. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
12. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
13. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
14. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
15. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
16. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
17. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
18. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
19. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
20. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
21. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
22. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
23. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
24. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
25. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
26. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
27. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
28. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
29. [https://www.jianshu.com/p/88999989988d](https://www.jianshu.com/p/88999989988d)
30
