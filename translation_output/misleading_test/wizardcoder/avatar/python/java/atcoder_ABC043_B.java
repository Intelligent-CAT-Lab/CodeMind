Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
-87

```
s = str ( input ( ) )
my_str =''
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c =='B'and len ( my_str )!= 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String my_str = " ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                my_str += c;
            } else if (c == 'B' && my_str.length()!= 0) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}
```<|endoftext|>
