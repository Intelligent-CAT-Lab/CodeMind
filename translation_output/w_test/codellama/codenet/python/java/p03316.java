<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
Yes


```
n = input()

sn = 0

for i in range(len(n)):
    sn += int(n[i])


if (int(n) % sn == 0):
    print("Yes")
else:
    print("No")

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sn = 0;
        for (int i = 0; i < n.length(); i++) {
            sn += n.charAt(i) - '0';
        }
        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to convert the input to a string. It then uses a `for` loop to iterate over the characters in the string and calculate the sum of the digits. Finally, it checks if the input number is divisible by the sum of its digits, and prints "Yes" or "No" accordingly.</s>
