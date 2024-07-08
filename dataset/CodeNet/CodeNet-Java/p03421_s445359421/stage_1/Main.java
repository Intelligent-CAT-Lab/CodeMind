import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if((long)A*B< N || N<(long)A+B-1){
var newVariable_0 = sb.append(-1);		}
		else{
			int n = 0;
			for(int i=1;i<=A;i++){
				while(n + B + (A-i) > N)	B--;
				
				for(int j=n+B;j>n;j--){
var newVariable_1 = sb.append(j+" ");				}
				n+=B;
			}
			
var newVariable_2 = sb.deleteCharAt(sb.length()-1);var newVariable_3 = sb.length();			sb.deleteCharAt(newVariable_3-1);
		}
		System.out.println(sb);
	}
}
