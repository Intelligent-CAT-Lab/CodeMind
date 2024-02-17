import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l;
		for(l=1; l<N; l++){
			N -= l;
		}
		if(N != l){
			System.out.println("No");
			System.out.flush();
			return;
		}
		System.out.println("Yes");
		System.out.println(l+1);
		int[][] answer = new int[l+1][l];
		int Index = 1;
		for(int i=0; i<=l; i++){
		StringBuilder string = new StringBuilder();
			string.append(l);
			int j=0;
			for(; j<i; j++){
				string.append(" ");
				string.append(answer[j][i-1]);
			}
			for(; j<l; j++){
				string.append(" ");
				string.append(answer[i][j]=Index++);
			}
			System.out.println(string.toString());
		}
		System.out.flush();
		return;
	}
}
