import java.util.*;
import java.math.*;

class Main{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
System.out.println("[INST]6;str;sc.next();"+str);
		BigInteger A = new BigInteger(str);
		str = sc.next();
System.out.println("[INST]8;str;sc.next();"+str);
		BigInteger B = new BigInteger(str);
		System.out.println(A.multiply(B));
	}
}

