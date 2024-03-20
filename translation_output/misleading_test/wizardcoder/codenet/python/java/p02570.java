Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 15 80

Expected output:
{N-

```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];
        for(int i=0;i<3;i++){
            data[i] = sc.nextInt();
        }
        if(data[0]/data[1]<=data[2]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```<|endoftext|>
