import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
var newVariable_0 = sc.next();		char[] T = newVariable_0.toCharArray();
		int N = T.length;
		
		int oneSum = 0;
		ArrayList<Integer> indexes = new ArrayList<>();
		for(int i=0; i<N; i++) {
			if(T[i]=='1') {
				int length = 0;
				for(int j=i; j<N; j++) {
					if(T[j]=='1')
						length++;
					else
						break;
				}
				if(length%2==1) {
var newVariable_1 = indexes.add(i-(oneSum-indexes.size()));var newVariable_2 = indexes.size();					indexes.add(i-(oneSum-newVariable_2));
				}
				oneSum += length;
				i += length;
			}
		}
		
		long zeroSum = N-oneSum;
var newVariable_3 = indexes.size();		long ans = (zeroSum+1)*(oneSum-newVariable_3)/2;
		
var newVariable_4 = indexes.size();		for(int i=0; i<newVariable_4; i++) {
			int index = indexes.get(i);
			ans += zeroSum+1 - (index-i+(1+i%2))/2;
		}
		
		for(int i=oneSum-1; i>=1; i--) {
			ans += (i+1)/2;
		}
		
		System.out.println(ans);
		sc.close();
	}

}

