class main:
    import java.util.Scanner;
    import java.math.BigInteger;
    
    public class p02477 {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String str = sc.next();
    		BigInteger A = new BigInteger(str);
    		str = sc.next();
    		BigInteger B = new BigInteger(str);
    		System.out.println(A.multiply(B));
    	}
    }
    
    
    
    import bigint
    
    A = bigint.BigInt(input())
    B = bigint.BigInt(input())
    print(A * B)