<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
80

Expected output:
51

```
n=list(input())
n.reverse()
lb,ub=0,len(n)
def check(x):
	g=0
	for i in n:
		x-=(x+g-int(i))%10
		if x<0:
			break
		g=(x+g)//10
	return x>=0
while ub-lb>1:
	mid=(lb+ub)//2
	if check(9*mid):
		ub=mid
	else:
		lb=mid
print(ub)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        n = sb.toString();
        int lb = 0, ub = n.length();
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(n, 9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    private static boolean check(String n, int x) {
        int g = 0;
        for (int i = 0; i < n.length(); i++) {
            x -= (x + g - Character.getNumericValue(n.charAt(i))) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, reverses it, and then uses binary search to find the smallest number that can be obtained by subtracting the reversed number from the original number. The `check` method is used to check if it's possible to subtract the reversed number from the original number.<｜end▁of▁sentence｜>
