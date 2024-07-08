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

var newVariable_0 = s.length();		for(int i = 0; i < newVariable_0; i++){
var newVariable_1 = s.charAt(i);			if(newVariable_1 == 'K') k++;
var newVariable_2 = s.charAt(i);			else if(newVariable_2 == 'U') u++;
var newVariable_3 = s.charAt(i);			else if(newVariable_3 == 'P') p++;
var newVariable_4 = s.charAt(i);			else if(newVariable_4 == 'C') c++;
		}

		System.out.println(Math.min(k, Math.min(u, Math.min(p, c))));
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }