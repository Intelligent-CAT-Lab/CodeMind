<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
127

Expected output:
4


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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> six = new ArrayList<>();
    static ArrayList<Integer> nine = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i < 8; i++) {
            six.add((int) Math.pow(6, i));
            nine.add((int) Math.pow(9, i));
        }

        Collections.reverse(six);
        Collections.reverse(nine);

        System.out.println(DP(N));
    }

    static int DP(int n) {
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

        count6 += DP(n);
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

        count9 += DP(n);
        n = tmp;

        return Math.min(count6, count9);
    }
}
```

This Java code does the same thing as your Python code. It calculates the minimum number of 6's and 9's that sum up to a given number. The main difference is that in Java, we use `ArrayList` instead of Python's list, and we use a `Scanner` to read the input.
<|EOT|>
