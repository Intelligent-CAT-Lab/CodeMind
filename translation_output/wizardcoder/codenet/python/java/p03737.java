Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toUpperCase();
        String[] arr = s1.split(" ");
        String s2 = arr[0];
        String s3 = arr[1];
        System.out.println(s2.charAt(0) + s3.charAt(0));
    }
}
```<|endoftext|>
