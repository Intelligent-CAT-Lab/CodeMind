<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99999

Expected output:
90984

```
n = int ( input ( ) )
cnt = 0
for i in range ( 1 , n + 1 ) :
    s = str ( i )
    if len ( s ) % 2 == 1 :
        cnt += 1
print ( cnt )


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to convert the input to a string. It then uses a `for` loop to iterate over the characters in the string, and a `if` statement to check if the length of the string is odd. If it is, it increments the `cnt` variable. Finally, it prints the value of `cnt` to the console.

Note that this code assumes that the input will be a positive integer. If the input is not a positive integer, the code will throw a `NumberFormatException`.</s>
