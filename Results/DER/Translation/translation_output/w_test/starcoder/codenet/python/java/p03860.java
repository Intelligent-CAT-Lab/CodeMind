<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC


```
A,x,C=input().split()
print("A"+x[0]+"C")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] arr=s.split(" ");
        System.out.print(arr[0]+arr[1].charAt(0)+"C");
    }
}
```

'''
<|endoftext|>
