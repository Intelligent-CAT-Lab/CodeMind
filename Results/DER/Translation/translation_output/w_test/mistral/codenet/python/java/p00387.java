<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
2


```
l=input().split()
A=int(l[0])
B=int(l[1])
kimawasi=B//A
if B%A>0:
    kimawasi=kimawasi+1
print(kimawasi)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int A = Integer.parseInt(l[0]);
        int B = Integer.parseInt(l[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi++;
        }
        System.out.println(kimawasi);
    }
}
```</s>
