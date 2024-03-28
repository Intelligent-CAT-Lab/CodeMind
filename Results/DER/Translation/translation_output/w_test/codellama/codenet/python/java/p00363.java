<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 B

Expected output:
+-+
|B|
+-+


```
w,h,c=input().split(" ")
w=int(w)
h=int(h)
print("+"+"-"*(w-2)+"+")
for i in range(h-2):
    if i*2==h-3:
        print("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|")
    else:
        print("|"+"."*(w-2)+"|")
print("+"+"-"*(w-2)+"+")

```
[/INST]
```java
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        char c = sc.next().charAt(0);
        sc.close();

        System.out.println("+" + "-".repeat(w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(w - 2) + "+");
    }
}
```
Note: The `repeat` method is used to repeat a string a certain number of times. In this case, it is used to repeat the `-` character to create the border of the rectangle, and the `+` character to create the corners. The `charAt` method is used to get the character at a specific index in a string.</s>
