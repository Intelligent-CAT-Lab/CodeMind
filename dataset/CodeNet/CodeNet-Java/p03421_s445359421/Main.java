import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if((long)A*B< N || N<(long)A+B-1){
			sb.append(-1);
		}
		else{
			int n = 0;
			for(int i=1;i<=A;i++){
				while(n + B + (A-i) > N)	B--;
				
				for(int j=n+B;j>n;j--){
					sb.append(j+" ");
				}
				n+=B;
			}
			
			sb.deleteCharAt(sb.length()-1);
		}
		System.out.println(sb);
	}
}
