import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int X = sc.nextInt();
		List<Integer> dp = new ArrayList<Integer>();
var newVariable_0 = dp.add(2);		int i = 2;
		do {		
			boolean f = true;
var newVariable_1 = dp.size();			for(int j=0;j<newVariable_1;j++) {
var newVariable_2 = dp.get(j);				if(i%newVariable_2==0) {
					f=false;
					break;
				}
			}
var newVariable_3 = dp.add(i);			if(f) newVariable_3;
			i++;
		} while (i<X);
		int ans = 0;
		for(i=X;i<2*X;i++) {
			boolean f=true;
var newVariable_4 = dp.size();			for(int j=0;j<newVariable_4;j++){
var newVariable_5 = dp.get(j);				if(i%newVariable_5==0) {
					f=false;
					break;
				}
			}
			if(f) {
				ans=i;
				break;
			}
		}
		System.out.println(X==2?2:ans);
	}
}