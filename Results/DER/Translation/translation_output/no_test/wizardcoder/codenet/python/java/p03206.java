Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        String[] days = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        String day = days[D-25];
        System.out.println(day);
    }
}
```<|endoftext|>
