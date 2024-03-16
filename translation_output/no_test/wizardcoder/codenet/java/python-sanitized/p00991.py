import java.util.*;
import java.math.*;
class p00991:
    def main(self,Z):
        cin=Scanner(System.in)
        r=cin.nextInt()
        c=cin.nextInt()
        a1=cin.nextInt()
        a2=cin.nextInt()
        b1=cin.nextInt()
        b2=cin.nextInt()
        x=abs(a1-b1)
        y=abs(a2-b2)
        x=min(x,r-x)
        y=min(y,c-y)
        z=1
        C=min(x,y)
        if(x==r-x):
            z*=2
        if(y==c-y):
            z*=2
        b=BigInteger.ONE
        for i in range(C):
            b=b.multiply(BigInteger(str(x+y-i))).divide(BigInteger(str(i+1)))
        System.out.println(b.multiply(BigInteger(str(z))).mod(BigInteger("100000007")))