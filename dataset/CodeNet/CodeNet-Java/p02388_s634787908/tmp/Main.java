import java.util.Scanner;
public class Main {
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
System.out.println("[INST]5;x;sc.nextInt();"+x);
		int kakeru;
		kakeru=x*x*x;
		System.out.println(kakeru);
	}
	
	public static void main(String[] args){
		Main obj=new Main();
		obj.solve();
	}
}