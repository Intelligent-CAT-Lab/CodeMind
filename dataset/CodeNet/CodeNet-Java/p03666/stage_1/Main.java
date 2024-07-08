import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
		
		for(int i=0;i<=N-1;i++){
			long max=D*(N-1-i)-C*i;
			long min=C*(N-1-i)-D*i;
var newVariable_0 = Math.abs(B-A);var newVariable_1 = Math.abs(B-A);			if(newVariable_1>=min && newVariable_1<=max){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
