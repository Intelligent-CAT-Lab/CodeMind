
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int s=scn.nextInt();
System.out.println("[INST]8;s;scn.nextInt();"+s);
		 HashMap<Integer, Integer> hmap= new HashMap<>();
		 System.out.println(func(hmap,s,1));
	}

	public static int solve(int i, int a) {
		if(i==1) {
			return a;
		}
		if(a%2==0) {
			return a/2;
		}else {
			return 3*a+1;
		}
	}
	
	public static int func(HashMap<Integer, Integer> hmap, int a, int i) {
		if(hmap.containsKey(a)) {
System.out.println("[INST]25;None;hmap.containsKey(a);"+hmap.containsKey(a));
			return i;
		}
		hmap.put(a, i);
System.out.println("[INST]28;None;hmap.put(a, i);"+hmap.put(a, i));
		return func(hmap,solve(i+1,a),i+1);
	}
}
