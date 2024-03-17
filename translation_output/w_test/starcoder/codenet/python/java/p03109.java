<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
Heisei


```
A,B,C = map(str,input().split("/"))
if int(A) <= 2018:
  print("Heisei")
elif int(A) == 2019 and int(B) <=4 and int(C)<=30:
  print("Heisei")
else:
  print("TBD")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("/");
        if (Integer.parseInt(date[0]) <= 2018) {
            System.out.println("Heisei");
        } else if (Integer.parseInt(date[0]) == 2019 && Integer.parseInt(date[1]) <= 4 && Integer.parseInt(date[2]) <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```

'''
<|endoftext|>
