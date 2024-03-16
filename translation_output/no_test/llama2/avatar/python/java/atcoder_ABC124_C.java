<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
cnt1 = 0
cnt2 = 0
for i in range ( len ( s ) ) :
    if i % 2 == 0 :
        if s [ i ] == '0' :
            cnt1 += 1
        else :
            cnt2 += 1
    else :
        if s [ i ] == '0' :
            cnt2 += 1
        else :
            cnt1 += 1
print ( min ( cnt1 , cnt2 ) )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2++;
                } else {
                    cnt1++;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为字符数组，然后我们可以使用for循环来遍历字符数组。
2. 在for循环中，我们需要使用if语句来判断当前字符是否为0，如果是，则计数器cnt1或cnt2加1。
3. 如果当前字符不是0，则计数器cnt2或cnt1加1。
4. 最后，我们需要使用Math.min()方法来获取cnt1和cnt2的最小值。

### 复杂度分析

- 时间复杂度：O(n)，其中n为字符串的长度。
- 空间复杂度：O(1)，其中1表示不需要额外的空间。

### 相关题目

- [Python 中的 for 循环](https://www.jiuzhang.com/solutions/python-for-loop/)
- [Python 中的 if 语句](https://www.jiuzhang.com/solutions/python-if-statement/)
- [Python 中的 Math 模块](https://www.jiuzhang.com/solutions/python-math-module/)
- [Python 中的 Scanner 类](https://www.jiuzhang.com/solutions/python-scanner-class/)
</s>
