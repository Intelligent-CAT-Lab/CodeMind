<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for (int i = 1; i < 8; i++) {
            six[i-1] = (int)Math.pow(6, i);
            nine[i-1] = (int)Math.pow(9, i);
        }
        for (int i = 0; i < 7; i++) {
            six[i] = six[6-i];
            nine[i] = nine[6-i];
        }
        System.out.println(DP(N, six, nine));
    }

    public static int DP(int n, int[] six, int[] nine) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for (int i = 0; i < 7; i++) {
            if (six[i] <= n) {
                n -= six[i];
                count6 = 1;
                break;
            }
        }
        count6 += DP(n, six, nine);
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int i = 0; i < 7; i++) {
            if (nine[i] <= n) {
                n -= nine[i];
                count9 = 1;
                break;
            }
        }
        count9 += DP(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, calculates the powers of 6 and 9, and then calls the `DP` function to calculate the minimum number of 6's and 9's that sum up to the input number. The result is printed to the standard output.
<|EOT|>
