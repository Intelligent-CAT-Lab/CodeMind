<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1905

Expected output:
YMM

```
n = input()

a = int(n[0]+n[1])
b = int(n[2]+n[3])
if b == 0 or b > 12:
	if 1 <= a <= 12:
		print("MMYY")
	else:
		print("NA")
elif 1 <= a <= 12:
	print("AMBIGUOUS")
else:
	print("YYMM")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 100;
        int b = n / 100;
        if (b == 0 || b > 12) {
            if (1 <= a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```</s>
