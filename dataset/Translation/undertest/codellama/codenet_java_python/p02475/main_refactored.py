class main:
    import java.math.BigInteger;
    import java.util.Scanner;
    
    public class p02475 {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		BigInteger a = scan.nextBigInteger();
    		BigInteger b = scan.nextBigInteger();
    		System.out.println(a.divide(b));
    	}
    }
    
    
    
    import math
    
    a, b = map(int, input().split())
    print(a // b)