<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1234567876

Expected output:
-27

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
This code first takes the input from the user and stores it in a string variable `input`. It then initializes an integer variable `a` to a large value (99999) to keep track of the minimum absolute difference between 753 and the sum of the first three digits of the input.

The code then loops through the input string, starting from the second character (index 1) and ending at the third-to-last character (index `input.length() - 2`). For each iteration, it takes the substring of length 3 starting from the current index and converts it to an integer using `Integer.parseInt()`. It then calculates the absolute difference between 753 and the sum of the first three digits of the input and updates the value of `a` if it is smaller than the current value of `a`.

Finally, the code prints the value of `a` to the console.</s>
