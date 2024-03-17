<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5728

Expected output:
4221


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
        StringBuilder st = new StringBuilder();

        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st.append('9');
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(String.valueOf(ip.charAt(i))) > 4) {
                    int n = 9 - Integer.parseInt(String.valueOf(ip.charAt(i)));
                    st.append(n);
                } else {
                    st.append(ip.charAt(i));
                }
            }
        } else {
            st.append(ip);
        }
        System.out.println(Integer.parseInt(st.toString()));
    }
}
```

This Java code does the same thing as the Python code. It reads a string input from the user, checks if the length of the string is not 1, and if the first character is '9', it appends '9' to the string builder and removes the first character from the string. Then it iterates over the remaining characters in the string, if the character is greater than 4, it calculates the difference between 9 and the character and appends it to the string builder, otherwise it appends the character as is. Finally, it prints the integer value of the string builder.<｜end▁of▁sentence｜>
