Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,y=map(int,input().split())
for i in range(n+1):
    for j in range(n-i+1):
        if (y-(i*10000+j*5000))/1000==(n-i-j):
            print(str(i)+' '+str(j)+' '+str(n-i-j))
            exit()
print('-1 -1 -1')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    System.exit(0);
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
```<|endoftext|>
