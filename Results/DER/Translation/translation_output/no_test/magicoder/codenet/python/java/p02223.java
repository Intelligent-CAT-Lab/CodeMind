<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.println("1" + "0".repeat(i) + "1");
            }
        }
    }
}
```

Please note that Java does not have a built-in function to repeat a string, so we use the ```"0".repeat(i)``` to achieve the same effect as the Python code.<｜end▁of▁sentence｜>
