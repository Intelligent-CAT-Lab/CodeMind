import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
System.out.println("[INST]10;N;sc.nextInt();"+N);
		long A=sc.nextLong();
System.out.println("[INST]11;A;sc.nextLong();"+A);
		long B=sc.nextLong();
System.out.println("[INST]12;B;sc.nextLong();"+B);
		long C=sc.nextLong();
System.out.println("[INST]13;C;sc.nextLong();"+C);
		long D=sc.nextLong();
System.out.println("[INST]14;D;sc.nextLong();"+D);
		
		for(int i=0;i<=N-1;i++){
			long max=D*(N-1-i)-C*i;
			long min=C*(N-1-i)-D*i;
			if(Math.abs(B-A)>=min && Math.abs(B-A)<=max){
System.out.println("[INST]19;None;Math.abs(B-A);"+Math.abs(B-A));
System.out.println("[INST]19;None;Math.abs(B-A);"+Math.abs(B-A));
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
