a,b=map(int,input().split())
if a<=0 and 0<=b:
    print("Zero")
else:
    print("Positive" if (min(0,b)-min(-1,a))%2==1 else "Negative")

/p04034.md
# p04034

Translate the following java code to python and enclose your solution inside :

import java.util.Scanner;

public class p04034 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a=s.nextInt(),b=s.nextInt();
        System.out.println(a==b?"Equal":a<b?"Less":"Greater");
    }
}