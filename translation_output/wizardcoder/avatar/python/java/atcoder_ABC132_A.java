Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ]!= s [ 2 ] : print ('Yes')
else : print ('No')


```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[2] == arr[3] && arr[0]!= arr[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
