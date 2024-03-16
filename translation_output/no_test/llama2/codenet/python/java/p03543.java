<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def main():
    N = input()

    a, b, c, d = list(N)
    if a == b == c or b == c == d:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()

```

### 解答

```java
public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int a = N % 10;
        int b = N / 10 % 10;
        int c = N / 100 % 10;
        int d = N / 1000 % 10;
        if (a == b || b == c || c == d || b == c || d == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### 解析

1. 将python的input()转换为java的Integer.parseInt()
2. 将python的list()转换为java的int[]
3. 将python的if语句转换为java的if语句
4. 将python的print()转换为java的System.out.println()

### 参考

[Python to Java](https://www.geeksforgeeks.org/python-to-java/)
</s>
