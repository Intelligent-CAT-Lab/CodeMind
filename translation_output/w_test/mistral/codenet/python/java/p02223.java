<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
2
0
11


```
n=input()

if n==1:
	print "1\n0"
elif n==2:
	print "2\n0\n11"
else:
	print n-1
	for i in xrange(n-1):
		print "1"+("0"*i)+"1"


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1");
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("2");
            System.out.println("0");
            System.out.println("11");
        } else {
            System.out.println(n - 1);
            for (int i = 1; i < n; i++) {
                System.out.println("1" + ("0".repeat(i)));
            }
        }
    }
}
```</s>
