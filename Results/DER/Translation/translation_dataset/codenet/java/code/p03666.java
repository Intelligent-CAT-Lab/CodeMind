import java.util.Scanner;

public class p03666 {

	public static void main(String[] args) {
		new p03666().solve();
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
			if(Math.abs(B-A)>=min && Math.abs(B-A)<=max){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
