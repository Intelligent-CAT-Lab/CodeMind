<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a = list ( map ( int , input ( ) . split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```

### Solution

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(Integer.parseInt(sc.nextLine()));
        }
        int e = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
            e++;
        }
    }
}
```
</s>
