import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] T = sc.next().toCharArray();
System.out.println("[INST]6;T;sc.next().toCharArray();"+T);
System.out.println("[INST]6;None;sc.next();"+sc.next());
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
					indexes.add(i-(oneSum-indexes.size()));
System.out.println("[INST]21;None;indexes.add(i-(oneSum-indexes.size()));"+indexes.add(i-(oneSum-indexes.size())));
System.out.println("[INST]21;None;indexes.size();"+indexes.size());
				}
				oneSum += length;
				i += length;
			}
		}
		
		long zeroSum = N-oneSum;
		long ans = (zeroSum+1)*(oneSum-indexes.size())/2;
System.out.println("[INST]29;None;indexes.size();"+indexes.size());
		
		for(int i=0; i<indexes.size(); i++) {
System.out.println("[INST]31;None;indexes.size();"+indexes.size());
			int index = indexes.get(i);
System.out.println("[INST]32;index;indexes.get(i);"+index);
			ans += zeroSum+1 - (index-i+(1+i%2))/2;
		}
		
		for(int i=oneSum-1; i>=1; i--) {
			ans += (i+1)/2;
		}
		
		System.out.println(ans);
		sc.close();
	}

}

