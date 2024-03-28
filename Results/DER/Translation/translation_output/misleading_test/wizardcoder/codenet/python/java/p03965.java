Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
-92

```
s=input()
print(len(s)//2-s.count('p'))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'){
                count++;
            }
        }
        System.out.println(s.length()/2-count);
    }
}
```<|endoftext|>
