import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
System.out.println("[INST]7;N;sc.nextInt();"+N);
		int A = sc.nextInt();
System.out.println("[INST]8;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]9;B;sc.nextInt();"+B);
		StringBuilder sb = new StringBuilder();
		if((long)A*B< N || N<(long)A+B-1){
			sb.append(-1);
System.out.println("[INST]12;None;sb.append(-1);"+sb.append(-1));
		}
		else{
			int n = 0;
			for(int i=1;i<=A;i++){
				while(n + B + (A-i) > N)	B--;
				
				for(int j=n+B;j>n;j--){
					sb.append(j+" ");
System.out.println("[INST]20;None;sb.append(j+' ');"+sb.append(j+" "));
				}
				n+=B;
			}
			
			sb.deleteCharAt(sb.length()-1);
System.out.println("[INST]25;None;sb.deleteCharAt(sb.length()-1);"+sb.deleteCharAt(sb.length()-1));
System.out.println("[INST]25;None;sb.length();"+sb.length());
		}
		System.out.println(sb);
	}
}
