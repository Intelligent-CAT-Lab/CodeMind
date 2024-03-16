<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x = int(input())
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print(int(a))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print(int(x) + 1)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        int t = 0;
        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))){
            double a = (-1 + Math.sqrt(1 + 8 * x))/2;
            System.out.println(Math.floor(a));
        }
        else{
            double x = (-1 + Math.sqrt(1 + 8 * x))//2;
            System.out.println(Math.floor(x) + 1);
        }
    }
}
```
<|endoftext|>
