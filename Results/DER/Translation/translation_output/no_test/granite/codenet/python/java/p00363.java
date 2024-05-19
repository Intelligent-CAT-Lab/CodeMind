System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int width = Integer.parseInt(input[0]);
        int height = Integer.parseInt(input[1]);
        char center = input[2].charAt(0);

        System.out.println("+" + "-".repeat(width - 2) + "+");
        for (int i = 0; i < height - 2; i++) {
            if (i * 2 == height - 3) {
                System.out.println("|" + ".".repeat((width - 3) / 2) + center + "."
                       .repeat((width - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(width - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(width - 2) + "+");
    }
}
```<|endoftext|>
