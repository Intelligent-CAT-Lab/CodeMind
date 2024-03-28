Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
vamshi, z = map ( int, input ( ). split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int vamshi = Integer.parseInt(input[0]);
        int z = Integer.parseInt(input[1]);
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```<|endoftext|>
