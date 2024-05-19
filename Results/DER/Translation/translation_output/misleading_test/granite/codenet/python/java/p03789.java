System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] digits = new int[10];
        int temp = n;
        int index = 0;
        while (temp > 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        int lb = 0;
        int ub = n;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(mid, digits)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }

        System.out.println(ub);
    }

    public static boolean check(int x, int[] digits) {
        int g = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            x -= (x + g - digits[i]) % 10;
            if (x < 0) {
                return false;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

Test input:
80

Expected output:
51<|endoftext|>
