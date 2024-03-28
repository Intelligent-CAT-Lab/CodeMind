<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99999

Expected output:
90909


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
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
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
This code takes an integer `n` as input and counts the number of integers between 1 and `n` that have an odd number of digits. It then prints the result.

Here's an example of how to run the code:
```
$ java Main 99999
90909
```</s>
