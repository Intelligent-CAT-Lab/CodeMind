System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s = input ( )
num_0 = 0
num_1 = 0
for i in range ( len ( s ) ) :
    if s [ i ] == "0" :
        num_0 += 1
    else :
        num_1 += 1
print ( min ( num_0, num_1 ) * 2 )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num0 = 0;
        int num1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num0++;
            } else {
                num1++;
            }
        }
        System.out.println(Math.min(num0, num1) * 2);
    }
}
```<|endoftext|>
