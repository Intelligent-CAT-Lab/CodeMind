Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
-10

```
f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        for(int i=f; i<=t; i++){
            if(isPalindrome(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(int num){
        String str = String.valueOf(num);
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!= str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
```<|endoftext|>
