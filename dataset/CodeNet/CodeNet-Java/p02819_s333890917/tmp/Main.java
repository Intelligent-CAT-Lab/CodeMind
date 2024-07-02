import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int X = sc.nextInt();
System.out.println("[INST]6;X;sc.nextInt();"+X);
		List<Integer> dp = new ArrayList<Integer>();
		dp.add(2);
System.out.println("[INST]8;None;dp.add(2);"+dp.add(2));
		int i = 2;
		do {		
			boolean f = true;
			for(int j=0;j<dp.size();j++) {
System.out.println("[INST]12;None;dp.size();"+dp.size());
				if(i%dp.get(j)==0) {
System.out.println("[INST]13;None;dp.get(j);"+dp.get(j));
					f=false;
					break;
				}
			}
			if(f) dp.add(i);
System.out.println("[INST]18;None;dp.add(i);"+dp.add(i));
			i++;
		} while (i<X);
		int ans = 0;
		for(i=X;i<2*X;i++) {
			boolean f=true;
			for(int j=0;j<dp.size();j++){
System.out.println("[INST]24;None;dp.size();"+dp.size());
				if(i%dp.get(j)==0) {
System.out.println("[INST]25;None;dp.get(j);"+dp.get(j));
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