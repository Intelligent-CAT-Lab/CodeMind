

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}

```


```

java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}

```
/README.md
# Python-to-Java

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3900

```
N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))
