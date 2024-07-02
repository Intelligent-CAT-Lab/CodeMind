import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			long x = sc.nextLong();
System.out.println("[INST]6;x;sc.nextLong();"+x);
			String twobit = Long.toBinaryString(x);
System.out.println("[INST]7;twobit;Long.toBinaryString(x);"+twobit);
			String left = Long.toBinaryString(x<<1);  //左シフト
System.out.println("[INST]8;left;Long.toBinaryString(x<<1);"+left);
			String right = Long.toBinaryString(x>>1);  //右シフト
System.out.println("[INST]9;right;Long.toBinaryString(x>>1);"+right);
			twobit = to32(twobit);
			left = to32(left);
			right = to32(right);
			System.out.println(twobit);
			for (int i=0; i<32; i++) {
				if (twobit.substring(i, i+1).equals("0")) System.out.print('1');
System.out.println("[INST]15;None;twobit.substring(i, i+1).equals('0');"+twobit.substring(i, i+1).equals("0"));
System.out.println("[INST]15;None;twobit.substring(i, i+1);"+twobit.substring(i, i+1));
				else System.out.print('0');
			}
			System.out.print('\n');
			System.out.println(left + '\n' + right);
		}
	}


	//桁数を32にする
	static String to32(String s) {
		int a = 32-s.length();
System.out.println("[INST]26;None;s.length();"+s.length());
		if (a != 0)	for (int i=0; i<a; i++)	s = '0' + s;
		if (a < 0) s = s.substring(s.length()-32);
System.out.println("[INST]28;s;s.substring(s.length()-32);"+s);
System.out.println("[INST]28;None;s.length();"+s.length());
		return s;
	}
}
