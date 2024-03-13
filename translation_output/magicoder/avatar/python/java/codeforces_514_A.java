<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
ip = input ( )
st = " "
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String st = " ";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(String.valueOf(ip.charAt(i))) > 4) {
                    int n = 9 - Integer.parseInt(String.valueOf(ip.charAt(i)));
                    st += String.valueOf(n);
                } else {
                    st += String.valueOf(ip.charAt(i));
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the string is not of length 1, and then checks if the first character is '9'. If it is, it replaces '9' with an empty string and removes the first character from the string. Then it iterates over the string, if the character is greater than 4, it calculates the difference between 9 and the character and appends it to the string, otherwise it appends the character as it is. Finally, it prints the integer value of the string.<｜end▁of▁sentence｜>
