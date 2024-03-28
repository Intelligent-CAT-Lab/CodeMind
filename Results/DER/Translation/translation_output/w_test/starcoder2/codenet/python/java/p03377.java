
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
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

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

// 请在这里编写一个方法，实现题目要求的功能
// 然后提交到GitHub，随后将GitHub上最新的代码链接提交到课程系统
