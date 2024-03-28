<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weeks = sc.nextInt();
        debtHell(100000, weeks);
    }
    
    public static void debtHell(int total, int weeks){
        int sum = total;
        for(int i = 0; i < weeks; i++){
            double yield = sum * 0.05;
            if(yield % 1000 == 0){
                sum += yield;
            }else{
                sum += (int)(yield /1000 + 1) *1000;
            }
        }
        System.out.println(sum);
    }
}

```

### 解答

```python
import java.util

def debtHell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += (int)(yield /1000 + 1) *1000
    return sum

if __name__ == '__main__':
    total = int(input())
    weeks = int(input())
    print(debtHell(total, weeks))
```

### 解析

1. 将 `import java.util` 改为 `import java.util`
2. 将 `public class p00007` 改为 `def debtHell`
3. 将 `public static void main(String[] args)` 改为 `if __name__ == '__main__':`
4. 将 `Scanner sc = new Scanner(System.in);` 改为 `total = int(input())`
5. 将 `int weeks = sc.nextInt();` 改为 `weeks = int(input())`
6. 将 `debtHell(100000, weeks);` 改为 `print(debtHell(total, weeks))`
7. 将 `public static void debtHell(int total, int weeks){` 改为 `def debtHell(total, weeks):`
8. 将 `int sum = total;` 改为 `sum = total`
9. 将 `for(int i = 0; i < weeks; i++){` 改为 `for i in range(weeks):`
10. 将 `double yield = sum * 0.05;` 改为 `yield = sum * 0.05`
11. 将 `if(yield % 1000 == 0){` 改为 `if yield % 1000 == 0:`
12. 将 `sum += yield;` 改为 `sum += yield`
13. 将 `}else{` 改为 `else:`
14. 将 `sum += (int)(yield /1000 + 1) *1000;` 改为 `sum += (int)(yield /1000 + 1) *1000`
15. 将 `}` 改为 `return sum`
16. 将 `}` 改为 `}`

### 复杂度分析

1. 时间复杂度：O(weeks)。
2. 空间复杂度：O(1)。

### 相关题目

1. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
2. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
3. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
4. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
5. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
6. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
7. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
8. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
9. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
10. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
11. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
12. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
13. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
14. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
15. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
16. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
17. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
18. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
19. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
20. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
21. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
22. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
23. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
24. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
25. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
26. [牛客网-00007-牛客网](https://www.nowcoder.com/practice/b00007)
27. [牛客网-00007-牛客网](https://www.nowcoder.
