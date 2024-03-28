

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A * N, B));
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A * N, B));
    }
}
```
/README.md
# Python to Java

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 17 120

Expected output:
119


```
N,A,B=map(int,input().split())

print(min(A*N,B))
```
