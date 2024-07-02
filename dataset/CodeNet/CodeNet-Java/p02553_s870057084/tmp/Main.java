public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var a = sc.nextBigInteger();
System.out.println("[INST]3;a;sc.nextBigInteger();"+a);
		var b = sc.nextBigInteger();
System.out.println("[INST]4;b;sc.nextBigInteger();"+b);
		var c=sc.nextBigInteger();
System.out.println("[INST]5;c;sc.nextBigInteger();"+c);
		var d = sc.nextBigInteger();
System.out.println("[INST]6;d;sc.nextBigInteger();"+d);
		var ac = a.multiply(c);
System.out.println("[INST]7;ac;a.multiply(c);"+ac);
		var ad = a.multiply(d);
System.out.println("[INST]8;ad;a.multiply(d);"+ad);
		var bd = b.multiply(d);
System.out.println("[INST]9;bd;b.multiply(d);"+bd);
		var bc = b.multiply(c);
System.out.println("[INST]10;bc;b.multiply(c);"+bc);
		System.out.println(ad.max(ac.max(bc.max(bd))));
	}
}
