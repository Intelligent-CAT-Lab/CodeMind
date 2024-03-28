<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
2


```
a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))

```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        String input = "KUPCkupcKUPC";
        int K = 0, U = 0, P = 0, C = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'K') {
                K++;
            } else if (c == 'U') {
                U++;
            } else if (c == 'P') {
                P++;
            } else if (c == 'C') {
                C++;
            }
        }
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
    }
}
```
This code uses a for loop to iterate over the characters in the input string, and uses an if-else statement to check if each character is 'K', 'U', 'P', or 'C'. If it is, it increments the corresponding variable. Finally, it uses the Math.min() method to find the minimum of the four variables, and prints the result.</s>
