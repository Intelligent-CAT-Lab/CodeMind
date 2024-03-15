<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def II(): return int(sys.stdin.readline())
def LS(): return sys.stdin.readline().split()
sys.setrecursionlimit(10**7)
INF = 10 ** 18
MOD = 10 ** 9 + 7
def LI_(): return [int(x) - 1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def SI(): return input()
YN = lambda b: print('YES') if b else print('NO')
yn = lambda b: print('Yes') if b else print('No')

S = SI().strip()

N = len(S)

zero_start = 0
zero_start_counter = 0
for i in range(N):
    if not zero_start == int(S[i]):
        zero_start_counter += 1
    zero_start = (zero_start+1)%2

one_start_counter = N - zero_start_counter

print(min(zero_start_counter, one_start_counter))

```

### 解题思路

1. 首先，我们需要将 python 代码转换为 java 代码。
2. 然后，我们需要将输入转换为字符串，并将字符串转换为 int 类型。
3. 最后，我们需要将输出转换为字符串，并将字符串转换为 int 类型。

### 代码实现

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] LI = new int[0];
        int II = 0;
        String[] LS = new String[0];
        int[] LI_ = new int[0];
        float[] LF = new float[0];
        String SI = "";
        boolean YN = false;
        boolean yn = false;
        int S = 0;
        int N = 0;
        int zero_start = 0;
        int zero_start_counter = 0;
        int one_start_counter = 0;

        LI = LI();
        II = II();
        LS = LS();
        LI_ = LI_();
        LF = LF();
        SI = SI();
        YN = YN();
        yn = yn();

        N = SI.length();

        zero_start = 0;
        zero_start_counter = 0;
        for (int i = 0; i < N; i++) {
            if (!zero_start == Integer.parseInt(SI.charAt(i))) {
                zero_start_counter += 1;
            }
            zero_start = (zero_start + 1) % 2;
        }
        one_start_counter = N - zero_start_counter;

        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }

    public static int[] LI() {
        int[] LI = new int[0];
        String[] LI_ = new String[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];
        int[] LI_ = new int[0];

