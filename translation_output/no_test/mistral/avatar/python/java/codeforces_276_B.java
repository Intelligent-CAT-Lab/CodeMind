<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = list ( input ( ) )
x = True
dt = { }
for i in s :
    if i in dt :
        dt [ i ] += 1
    else :
        dt [ i ] = 1
cnt = 0
x = True
for key , value in dt . items ( ) :
    if value % 2 != 0 and cnt < 1 :
        cnt += 1
    elif value % 2 != 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( " First " )
elif not x and len ( s ) % 2 == 0 :
    print ( " Second " )
elif not x and len ( s ) % 2 != 0 :
    print ( " First " )


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> s = new ArrayList<>(Arrays.asList(sc.nextInt()));
        Map<Integer, Integer> dt = new HashMap<>();
        for (int i : s) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Integer, Integer> keyValue : dt.entrySet()) {
            if (keyValue.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (keyValue.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.size() % 2 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```</s>
