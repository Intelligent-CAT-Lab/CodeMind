import java.util.*;

public class Main {
	static class LongInteger {
		ArrayList<Integer> n;
		int dsum = -1;
		
		public LongInteger(String str) {
			n = new ArrayList<>();
			for(int i=str.length()-1; i>=0; i--) {
				n.add(str.charAt(i)-'0');
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
				int temp = (idx < n.size() ? n.get(idx) : 0) + carry;
				dsum += temp%10 - (idx < n.size() ? n.get(idx) : 0);
				if(idx < n.size())
					n.set(idx, temp%10);
				else
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
		
		for(int i=0; i<=str.length(); i++) {
			if(N.dsum() <= i*9) {
				System.out.println(i);
				break;
			}
			N.add(9);
		}
		
		sc.close();
	}

}