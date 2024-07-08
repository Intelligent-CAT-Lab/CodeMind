import java.util.*;

public class Main {
	static class LongInteger {
		ArrayList<Integer> n;
		int dsum = -1;
		
		public LongInteger(String str) {
			n = new ArrayList<>();
var newVariable_0 = str.length();			for(int i=newVariable_0-1; i>=0; i--) {
var newVariable_1 = str.charAt(i);				n.add(newVariable_1-'0');
			}
		}
		
		public int dsum() {
			if(dsum == -1) {
				dsum=0;
				for(int i : n)
					dsum += i;
			}
			return dsum;
		}
		
		public void multi(int x) {
			ArrayList<Integer> nn = new ArrayList<>();
			int carry = 0;
			for(int i : n) {
				int temp = i*x+carry;
				nn.add(temp%10);
				carry = temp/10;
			}
			while(carry>0) {
				nn.add(carry%10);
				carry /= 10;
			}
			n = nn;
			dsum = -1;
		}
		
		public void add(int x) {
			int carry = x;
			int idx = 0;
			while(carry>0) {
var newVariable_2 = n.size();var newVariable_3 = n.get(idx);				int temp = (idx < n.size() ? newVariable_3 : 0) + carry;
var newVariable_4 = n.size();var newVariable_5 = n.get(idx);				dsum += temp%10 - (idx < n.size() ? newVariable_5 : 0);
var newVariable_6 = n.size();				if(idx < newVariable_6)
var newVariable_7 = n.set(idx, temp%10);				else
					n.add(temp%10);
				carry = temp/10;
				idx++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		LongInteger N = new LongInteger(str);

		N.multi(9);
		
var newVariable_8 = str.length();		for(int i=0; i<=newVariable_8; i++) {
			if(N.dsum() <= i*9) {
				System.out.println(i);
				break;
			}
			N.add(9);
		}
		
		sc.close();
	}

}