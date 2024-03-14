Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='o'){
                count++;
            }
        }
        System.out.println(700+100*count);
    }
}
```<|endoftext|>
