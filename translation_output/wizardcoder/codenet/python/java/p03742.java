Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(Math.abs(a-b)>1){
            System.out.println("Alice");
        }else{
            System.out.println("Brown");
        }
    }
}
```<|endoftext|>
