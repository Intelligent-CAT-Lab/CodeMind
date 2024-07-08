public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var a = sc.nextBigInteger();
		var b = sc.nextBigInteger();
		var c=sc.nextBigInteger();
		var d = sc.nextBigInteger();
		var ac = a.multiply(c);
		var ad = a.multiply(d);
		var bd = b.multiply(d);
		var bc = b.multiply(c);
		System.out.println(ad.max(ac.max(bc.max(bd))));
	}
}
