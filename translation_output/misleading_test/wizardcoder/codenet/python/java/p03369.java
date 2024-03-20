Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
863

```
s = input()
print(700+100*s.count("o"))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 700;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='o'){
                sum+=100;
            }
        }
        System.out.println(sum);
    }
}
```<|endoftext|>
