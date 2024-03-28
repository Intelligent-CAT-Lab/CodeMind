
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(a <= x && a + b >= x ? "YES" : "NO");
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n / a + (n % a > 0 ? 1 : 0)) * (m / a + (m % a > 0 ? 1 : 0)));
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 题目描述
> 请实现一个程序，要求输入一个整数，然后输出这个整数的绝对值。

> 例如，输入123，则输出123；输入-234，则输出234。

请在提交的代码中填入以下代码：

```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(absoluteValue(n));
    }

    public static int absoluteValue(int n) {
        // 在这里编写代码，将n的绝对值返回
        return 0;
    }
}
```

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 题目描述
> 给定三个整数a，b，c，如果一个数同时满足a能被它整除，且b也能被它整除，且c不能被它整除，则称这个数是“幸运数”。
> 
> 现在，给定a，b，c，请你统计一下，在1到100000之间（包含1和100000）总共有多少个幸运数。

请在提交的代码中填入以下代码：

```
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(countLuckyNumbers(a, b, c));
    }

    public static int countLuckyNumbers(int a, int b, int c) {
        // 在这里编写代码，统计并返回1到100000之间（包含1和100000）总共有多少个幸运数
        return 0;
    }
}
```

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 题目描述
> 给定一个整数n，请问n的阶乘n!末尾有多少个0？
> 
> 例如，5!=120，所以5的阶乘的末尾有1个0；10!=3628800，所以10的阶乘的末尾有2个0。

请在提交的代码中填入以下代码：

```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorialTrailingZeroes(n));
    }

    public static int factorialTrailingZeroes(int n) {
        // 在这里编写代码，计算并返回n的阶乘的末尾有多少个0
        return 0;
    }
}
```

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 题目描述
> 给定一个整数n，请问n的阶乘n!末尾有多少个0？
> 
> 例如，5!=120，所以5的阶乘的末尾有1个0；10!=3628800，所以10的阶乘的末尾有2个0。

请在提交的代码中填入以下代码：

```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorialTrailingZeroes(n));
    }

    public static int factorialTrailingZeroes(int n) {
        // 在这里编写代码，计算并返回n的阶乘的末尾有多少个0
        return 0;
    }
}
```

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 题目描述
> 给定一个整数n，请问n的阶乘n!末尾有多少个0？
> 
> 例如，5!=120，所以5的阶乘的末尾有1个0；10!=3628800，所以10的阶乘的末尾有2个0。

请在提交的代码中填入以下代码：

```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorialTrailingZeroes(n));
    }

    public static int factorialTrailingZeroes(int n) {
        // 在这里编写代码，计算并返回n的阶乘的末尾有多少个0
        return 0;
    }
}
```

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](../../src/main/java/com/github/hcsp/controlflow/Main.java)
-----


# 题目描述
> 给定一个整数n，请问n的阶乘n!末尾有多少个0？
> 
> 例如，5!=120，所以5的阶乘的末尾有1个0；10!=3628800，所以10的阶乘的末尾有2个0。

请在提交的代码中填入以下代码：

```
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorialTrailingZeroes(n));
    }

    public static int factorialTrailingZeroes(int n) {
        // 在这里编写代码，计算并返回n的阶乘的末尾有多少个0
        return 0;
    }
}
```

在提交Pull Request之前
