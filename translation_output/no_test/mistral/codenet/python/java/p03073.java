<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    static int[] LI() {
        String[] input = System.console().readLine().split(" ");
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = Integer.parseInt(input[i]);
        }
        return output;
    }

    static int II() {
        return Integer.parseInt(System.console().readLine());
    }

    static String[] LS() {
        return System.console().readLine().split(" ");
    }

    static void setRecursionLimit(int limit) {
        StackFrameHandler.setMaxStackFrameSize(limit);
    }

    static final int INF = (int) (1e18);
    static final int MOD = (int) (1e9 + 7);

    static int[] LI_() {
        String[] input = System.console().readLine().split(" ");
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = Integer.parseInt(input[i]) - 1;
        }
        return output;
    }

    static double[] LF() {
        String[] input = System.console().readLine().split(" ");
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = Double.parseDouble(input[i]);
        }
        return output;
    }

    static String SI() {
        return System.console().readLine();
    }

    static void YN(boolean b) {
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static void yn(boolean b) {
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().strip();

        int N = S.length();

        int zero_start = 0;
        int zero_start_counter = 0;
        for (int i = 0; i < N; i++) {
            if (zero_start != Integer.parseInt(S[i])) {
                zero_start_counter++;
            }
            zero_start = (zero_start + 1) % 2;
        }

        int one_start_counter = N - zero_start_counter;

        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }
}
```</s>
