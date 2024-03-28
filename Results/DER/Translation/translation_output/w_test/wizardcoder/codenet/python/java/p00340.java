Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
no


```
num = list(map(int,input().split()))
num.sort()
if num[0] == num[1] and num[2] ==num[3]:
    print("yes")
else :
    print("no")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for(int i=0;i<4;i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);
        if(num[0]==num[1] && num[2]==num[3]){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
```<|endoftext|>
