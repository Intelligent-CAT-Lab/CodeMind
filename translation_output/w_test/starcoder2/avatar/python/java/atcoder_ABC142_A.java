

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((N + 1) / N / 2);
        }
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        if (N >= M && N >= K) {
            System.out.println(N);
        } else if (M >= N && M >= K) {
            System.out.println(M);
        } else {
            System.out.println(K);
        }
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 最大的数

请实现一个函数，返回三个数中的最大值。

在命令行输入三个整数，请使用 `java Main` 命令运行程序，程序会输出一个整数（最大的那个）。

例如，命令行输入：

```
1 2 3
```

则程序应该输出：

```
3
```

再例如，命令行输入：

```
2 4 1
```

则程序应该输出：

```
4
```

> 注意：程序必须从命令行输入获取数据，不允许在代码中写死任何一个数字。

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
***教学很重要，请不要忽略！***

- 如果你觉得教学很重要，请不要吝啬你的赞同，给老师点个赞！
- 如果你觉得教学不重要，请不要吝啬你的反对，给老师点个反对！
- 如果你觉得教学很重要，但又不想点赞，请点个[关注](https://github.com/hcsp/controlflow/subscription)！

-----

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3


```
N = int ( input ( ) )
M = int ( input ( ) )
K = int ( input ( ) )
if N >= M and N >= K :
    print ( N )
elif M >= N and M >= K :
    print ( M )
else :
    print ( K )

