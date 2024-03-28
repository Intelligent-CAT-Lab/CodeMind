<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
16

```
a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.round(a/b));
    }
}
```
'''
<|endoftext|>
