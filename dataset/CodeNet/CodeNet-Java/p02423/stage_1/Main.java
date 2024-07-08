import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			long x = sc.nextLong();
			String twobit = Long.toBinaryString(x);
			String left = Long.toBinaryString(x<<1);  //左シフト
			String right = Long.toBinaryString(x>>1);  //右シフト
			twobit = to32(twobit);
			left = to32(left);
			right = to32(right);
			System.out.println(twobit);
			for (int i=0; i<32; i++) {
var newVariable_0 = twobit.substring(i, i+1).equals("0");var newVariable_1 = twobit.substring(i, i+1);				if (newVariable_1.equals("0")) System.out.print('1');
				else System.out.print('0');
			}
			System.out.print('\n');
			System.out.println(left + '\n' + right);
		}
	}


	//桁数を32にする
	static String to32(String s) {
var newVariable_2 = s.length();		int a = 32-newVariable_2;
		if (a != 0)	for (int i=0; i<a; i++)	s = '0' + s;
var newVariable_3 = s.length();		if (a < 0) s = s.substring(newVariable_3-32);
		return s;
	}
}
