Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
for key, value in dt. items ( ) :
    if value % 2!= 0 and cnt < 1 :
        cnt += 1
    elif value % 2!= 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( " First " )
elif not x and len ( s ) % 2 == 0 :
    print ( " Second " )
elif not x and len ( s ) % 2!= 0 :
    print ( " First " )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> s = new ArrayList<>();
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();
        while (sc.hasNext()) {
            s.add(sc.next().charAt(0));
        }
        for (char i : s) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }
        int cnt = 0;
        x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2!= 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2!= 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.size() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.size() % 2!= 0) {
            System.out.println("First");
        }
    }
}
```<|endoftext|>
