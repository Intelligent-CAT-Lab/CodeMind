import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int X = sc.nextInt();
		List<Integer> dp = new ArrayList<Integer>();
		dp.add(2);
		int i = 2;
		do {		
			boolean f = true;
			for(int j=0;j<dp.size();j++) {
				if(i%dp.get(j)==0) {
					f=false;
					break;
				}
			}
			if(f) dp.add(i);
			i++;
		} while (i<X);
		int ans = 0;
		for(i=X;i<2*X;i++) {
			boolean f=true;
			for(int j=0;j<dp.size();j++){
				if(i%dp.get(j)==0) {
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