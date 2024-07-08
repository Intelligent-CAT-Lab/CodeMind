import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < (1 << n); i++){
			Vector<Integer> va = new Vector<Integer>();
			for(int j = 0; j < n; j++){
var newVariable_0 = va.add(j);				if((i & (1 << j)) != 0) newVariable_0;
			}
			System.out.print(i + ":");
var newVariable_1 = va.size();			for(int j = 0; j < newVariable_1; j++){
				System.out.print(" " + va.get(j));
			}
			System.out.print("\n");
		}
	}
}

