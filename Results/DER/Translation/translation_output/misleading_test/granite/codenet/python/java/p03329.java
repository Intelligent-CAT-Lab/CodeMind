System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
127

Expected output:
8

```
import copy
N=int(input())
six = [6**i for i in range(1,8)][::-1]
nine = [9**i for i in range(1,8)] [::-1]
def DP(n):
	if n < 6:
		return n
	tmp = n
	count6 = 0
	count9 = 0
	for sixx in six:
		if sixx <= n:
			n -= sixx
			count6 = 1
			break
	count6 += DP(n)
	n = tmp
	if n < 9:
		return count6
	for ninee in nine:
		if ninee<= n:
			n -= ninee
			count9 = 1
			break
	count9 += DP(n)
	n = tmp
	return min(count6,count9)
print(DP(N))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        six[0] = 1;
        nine[0] = 1;
        for (int i = 1; i < 7; i++) {
            six[i] = six[i - 1] * 6;
            nine[i] = nine[i - 1] * 9;
        }
        System.out.println(dp(N, six, nine));
    }

    public static int dp(int n, int[] six, int[] nine) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for (int i = 6; i >= 0; i--) {
            if (six[i] <= n) {
                n -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += dp(n, six, nine);
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int i = 6; i >= 0; i--) {
            if (nine[i] <= n) {
                n -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += dp(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}
```<|endoftext|>
