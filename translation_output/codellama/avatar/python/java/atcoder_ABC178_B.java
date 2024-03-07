<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

a , b , c , d = map ( int , input ( ) . split ( ) )
ans = max ( a * c , a * d , b * c , b * d )
print ( ans )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class MaxProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int ans = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
        System.out.println(ans);
    }
}

This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `parseInt` method is used to convert each string to an integer. The `Math.max` method is used to find the maximum of the four products. Finally, the result is printed to the console using the `println` method.</s>
