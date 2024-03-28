a,b=map(int,input().split())
print(a//b)

/p02476.md
# p02476

Translate the following java code to python and enclose your solution inside .
A sample test case is provided below:

Test input:
5 8

Expected output:
1



/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.*;
import java.util.*;
public class p02476
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BigInteger a=scan.nextBigInteger();
        BigInteger b=scan.nextBigInteger();
        System.out.println(a.mod(b));
    }
}