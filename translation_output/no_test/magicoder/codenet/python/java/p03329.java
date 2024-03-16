<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for (int i = 1; i < 7; i++) {
            six[i] = (int) Math.pow(6, i);
            nine[i] = (int) Math.pow(9, i);
        }
        for (int i = 0; i < 7 / 2; i++) {
            int temp = six[i];
            six[i] = six[6 - i];
            six[6 - i] = temp;
            temp = nine[i];
            nine[i] = nine[6 - i];
            nine[6 - i] = temp;
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
        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        count6 += DP(n, six, nine);
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
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

This Java code does the same thing as the Python code. It reads an integer from the standard input, creates two arrays of powers of 6 and 9, and then calls the `DP` function with the input integer and the two arrays. The `DP` function calculates the minimum number of 6s and 9s needed to reach the input integer.<｜end▁of▁sentence｜>
