<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
    }
}
```

### 解答

```python
import java.util

def main():
    sc = java.util.Scanner(System.in)
    str = sc.next()
    print(str.matches("[A-Z]") ? "A" : "a")

if __name__ == "__main__":
    main()
```

### 解析

1. 将 `import java.util` 改为 `import java.util`
2. 将 `public class p02627` 改为 `def main()`
3. 将 `public static void main(String[] args)` 改为 `if __name__ == "__main__":`
4. 将 `Scanner sc = new Scanner(System.in)` 改为 `sc = java.util.Scanner(System.in)`
5. 将 `String str = sc.next()` 改为 `str = sc.next()`
6. 将 `System.out.println(str.matches("[A-Z]") ? "A" : "a")` 改为 `print(str.matches("[A-Z]") ? "A" : "a")`

### 总结

1. 将 `import java.util` 改为 `import java.util`
2. 将 `public class p02627` 改为 `def main()`
3. 将 `public static void main(String[] args)` 改为 `if __name__ == "__main__":`
4. 将 `Scanner sc = new Scanner(System.in)` 改为 `sc = java.util.Scanner(System.in)`
5. 将 `String str = sc.next()` 改为 `str = sc.next()`
6. 将 `System.out.println(str.matches("[A-Z]") ? "A" : "a")` 改为 `print(str.matches("[A-Z]") ? "A" : "a")`

### 参考

1. [Python 翻译 Java 代码](https://www.cnblogs.com/xiaohuochai/p/5994999.html)
</s>
