<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4

Expected output:
Yay!


```
a,b=map(int,input().split())
if a<9 and b<9:
    print("Yay!")
else:
    print(":(")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
```

'''
<|endoftext|>
