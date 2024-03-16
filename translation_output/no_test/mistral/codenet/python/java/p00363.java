<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width, height and character: ");
        String input = sc.nextLine();
        String[] values = input.split(" ");
        int w = Integer.parseInt(values[0]);
        int h = Integer.parseInt(values[1]);
        String c = values[2];

        System.out.println("+" + "-" * (w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + "." * ((w - 3) / 2) + c + "." * ((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + "." * (w - 2) + "|");
            }
        }
        System.out.println("+" + "-" * (w - 2) + "+");
    }
}
```</s>
