import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		String s = in.next();
		int k = 0, u = 0, p = 0, c = 0;

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'K') k++;
			else if(s.charAt(i) == 'U') u++;
			else if(s.charAt(i) == 'P') p++;
			else if(s.charAt(i) == 'C') c++;
		}

		System.out.println(Math.min(k, Math.min(u, Math.min(p, c))));
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }