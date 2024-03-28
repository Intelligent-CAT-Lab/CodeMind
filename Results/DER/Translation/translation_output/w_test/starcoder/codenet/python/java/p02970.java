<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2

Expected output:
2


```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(-(-n/(2*d+1)));
    }
}
```

'''
<|endoftext|>
