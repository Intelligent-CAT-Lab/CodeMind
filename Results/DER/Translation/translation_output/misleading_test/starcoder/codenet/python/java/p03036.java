<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
73
109
41
121
283
626
1346
2589
5137
10261

```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            x = r*x-d;
            System.out.println(x);
        }
    }
}
```
'''
<|endoftext|>
