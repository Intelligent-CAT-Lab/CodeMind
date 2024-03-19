<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-39

```
import java.util.*;

class p03963{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K;
        for(int i=2;i<=N;i++){
            ans *= K-1;
        }
        System.out.println(ans);
    }
}

```
[/INST]
```
import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K;
        for (int i = 2; i <= N; i++) {
            ans *= K - 1;
        }
        System.out.println(ans);
    }
}
```

Here's the Python code:
```
import java.util.Scanner;

class p03963:
    def main(self, args):
        sc = Scanner(System.in)
        N = sc.nextInt()
        K = sc.nextInt()
        ans = K
        for i in range(2, N+1):
            ans *= K-1
        print(ans)

if __name__ == "__main__":
    p03963().main(sys.argv[1:])
```
Note that the Python code is a bit different from the Java code, as Python does not have a `main` method and does not require the `import` statement for the `Scanner` class. Additionally, the Python code uses the `range` function to iterate from 2 to `N+1`, whereas the Java code uses a `for` loop with a fixed upper bound.</s>
