<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
s = input ( )
cnt1 = 0
cnt2 = 0
for i in range ( len ( s ) ) :
    if i % 2 == 0 :
        if s [ i ] == '0' :
            cnt1 += 1
        else :
            cnt2 += 1
    else :
        if s [ i ] == '0' :
            cnt2 += 1
        else :
            cnt1 += 1
print ( min ( cnt1 , cnt2 ) )


```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2++;
                } else {
                    cnt1++;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
    }
}
```
Explanation:

* We first take input from the user using `Scanner` class.
* We initialize two variables `cnt1` and `cnt2` to keep track of the number of 0s and 1s in the input string.
* We iterate through the input string using a `for` loop and check if the current character is 0 or 1.
* If the current character is 0, we increment `cnt1` by 1, otherwise we increment `cnt2` by 1.
* We use the `Math.min()` method to find the minimum of `cnt1` and `cnt2`.
* Finally, we print the minimum value.

Note: The `Math.min()` method returns the smaller of two values.</s>
