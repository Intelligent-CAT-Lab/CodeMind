
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(-(-n/(2*d+1)));
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
        int d = sc.nextInt();
        System.out.println(-(-n/(2*d+1)));
    }
}
```
/README.md
# python-to-java
Translate the following python code to java and enclose your solution inside ```java```:
```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()
