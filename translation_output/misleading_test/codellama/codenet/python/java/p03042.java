<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = Integer.parseInt(String.valueOf(n).substring(0, 2));
        int b = Integer.parseInt(String.valueOf(n).substring(2, 4));
        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```
Explanation:

* We first read the input from the user using the `Scanner` class.
* We then convert the input to a string using `String.valueOf(n)`.
* We extract the first two digits of the string using `substring(0, 2)` and store them in a variable `a`.
* We extract the last two digits of the string using `substring(2, 4)` and store them in a variable `b`.
* We then check the value of `b` and print the appropriate output.
* If `b` is 0 or greater than 12, we check if `a` is between 1 and 12, and print "MMYY" if it is, or "NA" otherwise.
* If `b` is between 1 and 12, we print "AMBIGUOUS".
* If `b` is greater than 12, we print "YYMM".

Note: The `Integer.parseInt()` method is used to convert the string to an integer. The `String.valueOf(n)` method is used to convert the integer to a string.</s>
