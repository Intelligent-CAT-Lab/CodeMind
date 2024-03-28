<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1900

Expected output:
102

```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(1000-n%1000);
    }
}
```
'''
<|endoftext|>
