System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String myStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr += c;
            } else if (c =='' &&!myStr.equals("")) {
                myStr = myStr.substring(0, myStr.length() - 1);
            }
        }
        System.out.println(myStr);
    }
}
```<|endoftext|>
