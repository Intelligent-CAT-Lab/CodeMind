<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = T / A * B;
        System.out.println(ans);
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `//` operator is used for integer division, and the `*` operator is used for multiplication. The `System.out.println()` method is used to print the result to the console.</s>
