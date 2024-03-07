<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class provides a way to read input from the user. The `Math.min` function is used to find the minimum of two numbers in Java.</s>
