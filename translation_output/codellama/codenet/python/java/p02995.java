<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
def readinput():
    a,b,c,d=map(int,input().split())
    return a,b,c,d

def main(a,b,c,d):
    lcm=c*d//math.gcd(c,d)
    #print(lcm)
    return b-a+1 - ( b//c-(a-1)//c + b//d-(a-1)//d - ( b//lcm - (a-1)//lcm ) )


if __name__=='__main__':
    a,b,c,d=readinput()
    ans=main(a,b,c,d)
    print(ans)


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        BigInteger lcm = BigInteger.valueOf(c).multiply(BigInteger.valueOf(d)).divide(BigInteger.valueOf(c).gcd(BigInteger.valueOf(d)));
        BigInteger result = BigInteger.valueOf(b).subtract(BigInteger.valueOf(a)).add(BigInteger.ONE).subtract(BigInteger.valueOf(b).divide(BigInteger.valueOf(c)).subtract(BigInteger.valueOf(a).divide(BigInteger.valueOf(c))).subtract(BigInteger.valueOf(b).divide(BigInteger.valueOf(d)).subtract(BigInteger.valueOf(a).divide(BigInteger.valueOf(d))).subtract(BigInteger.valueOf(b).divide(lcm).subtract(BigInteger.valueOf(a).divide(lcm)))));

        System.out.println(result);
    }
}

Note: The above code uses the `BigInteger` class to handle large numbers, as the result of the calculation can be very large.</s>
