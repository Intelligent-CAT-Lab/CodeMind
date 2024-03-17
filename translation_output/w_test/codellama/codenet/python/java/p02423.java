<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
00000000000000000000000000001000
11111111111111111111111111110111
00000000000000000000000000010000
00000000000000000000000000000100


```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;
        System.out.println(String.format("%032b", n));
        System.out.println(String.format("%032b", ~n & mask));
        System.out.println(String.format("%032b", (n << 1) & mask));
        System.out.println(String.format("%032b", (n >> 1) & mask));
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then uses the `String.format()` method to print the binary representation of the input number. The `mask` variable is used to ensure that the output is padded with leading zeros to a length of 32.

The `~n` operator is used to invert the bits of the input number, and the `&` operator is used to mask the result with the `mask` variable.

The `<<` and `>>` operators are used to shift the bits of the input number left and right, respectively, and the `&` operator is used to mask the result with the `mask` variable.

The `String.format()` method is used to print the binary representation of the input number, with leading zeros added to ensure that the output is padded to a length of 32.</s>
