Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = list ( map ( int, input ( ). split ( ) ) )
for e, i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```

### Response:
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = Arrays.asList(scanner.nextLine().split("\\s+")).stream().map(Integer::parseInt).toList();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```<|endoftext|>
