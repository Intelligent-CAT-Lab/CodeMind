import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
System.out.println("[INST]4;N;sc.nextInt();"+N);
		int l;
		for(l=1; l<N; l++){
			N -= l;
		}
		if(N != l){
			System.out.println("No");
			System.out.flush();
System.out.println("[INST]11;None;System.out.flush();"+System.out.flush());
			return;
		}
		System.out.println("Yes");
		System.out.println(l+1);
		int[][] answer = new int[l+1][l];
		int Index = 1;
		for(int i=0; i<=l; i++){
		StringBuilder string = new StringBuilder();
			string.append(l);
System.out.println("[INST]20;None;string.append(l);"+string.append(l));
			int j=0;
			for(; j<i; j++){
				string.append(" ");
System.out.println("[INST]23;None;string.append(' ');"+string.append(" "));
				string.append(answer[j][i-1]);
System.out.println("[INST]24;None;string.append(answer[j][i-1]);"+string.append(answer[j][i-1]));
			}
			for(; j<l; j++){
				string.append(" ");
System.out.println("[INST]27;None;string.append(' ');"+string.append(" "));
				string.append(answer[i][j]=Index++);
System.out.println("[INST]28;None;string.append(answer[i][j]=Index++);"+string.append(answer[i][j]=Index++));
			}
			System.out.println(string.toString());
		}
		System.out.flush();
System.out.println("[INST]32;None;System.out.flush();"+System.out.flush());
		return;
	}
}
