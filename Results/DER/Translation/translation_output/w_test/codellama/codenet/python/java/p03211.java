<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
34


```
S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = 99999;
        for (int i = 0; i < input.length() - 2; i++) {
            int num = Integer.parseInt(input.substring(i, i + 3));
            a = Math.min(Math.abs(753 - num), a);
        }
        System.out.println(a);
    }
}
```
This code first reads the input from the user using the `Scanner` class. It then initializes a variable `a` to a large value, which will be used to store the minimum difference between the input number and 753.

The code then loops through each 3-digit substring of the input string using a `for` loop. For each substring, it converts it to an integer using `Integer.parseInt()` and calculates the difference between the input number and 753 using `Math.abs()`. The minimum of these differences is then stored in `a` using `Math.min()`.

Finally, the code prints the value of `a` to the console.

Note that this code assumes that the input string is a valid 3-digit number. If the input string is not a valid 3-digit number, the code will throw a `NumberFormatException`.</s>
