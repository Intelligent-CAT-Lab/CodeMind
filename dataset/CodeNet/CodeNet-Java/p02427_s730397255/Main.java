import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < (1 << n); i++){
			Vector<Integer> va = new Vector<Integer>();
			for(int j = 0; j < n; j++){
				if((i & (1 << j)) != 0) va.add(j);
			}
			System.out.print(i + ":");
			for(int j = 0; j < va.size(); j++){
				System.out.print(" " + va.get(j));
			}
			System.out.print("\n");
		}
	}
}

