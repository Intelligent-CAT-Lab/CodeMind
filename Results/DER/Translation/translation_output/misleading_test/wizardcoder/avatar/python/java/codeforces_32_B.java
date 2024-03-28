Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
..

Expected output:
76

```
s = input ( )
result = " "
i = 0
while i < len ( s ) :
    if s [ i ] == ". " :
        result += '0'
    else :
        i += 1
        if s [ i ] == ". " :
            result += '1'
        else :
            result += '2'
    i += 1
print ( result )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = " ";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) =='') {
                result += '0';
            } else {
                i++;
                if (s.charAt(i) =='') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
