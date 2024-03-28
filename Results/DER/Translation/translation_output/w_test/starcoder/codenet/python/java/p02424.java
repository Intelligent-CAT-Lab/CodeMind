<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 10

Expected output:
00000000000000000000000000001000
00000000000000000000000000001010
00000000000000000000000000000010


```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
    }
}
```
'''
<|endoftext|>
