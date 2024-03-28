<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = String.valueOf(scanner.nextInt());
        char[] arr = n.toCharArray();
        int lb = 0, ub = arr.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(arr, mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    private static boolean check(char[] arr, int x) {
        int g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            x -= (x + g - (arr[i] - '0')) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer, converts it to a string, and then reverses the string. It then uses binary search to find the smallest possible number that can be formed by using the digits of the reversed string. The `check` method checks if it's possible to use the digits of the reversed string to form a number less than or equal to `x`. If it is, it returns `true`, otherwise `false`.
<|EOT|>
