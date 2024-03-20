Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
-30

```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int K = 0, U = 0, P = 0, C = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='K') K++;
            else if(a.charAt(i)=='U') U++;
            else if(a.charAt(i)=='P') P++;
            else if(a.charAt(i)=='C') C++;
        }
        System.out.println(Math.min(K,Math.min(U,Math.min(P,C))));
    }
}
```<|endoftext|>
