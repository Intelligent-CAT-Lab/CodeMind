import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
System.out.println("[INST]8;K;stdIn.nextInt();"+K);
		int X = stdIn.nextInt();
System.out.println("[INST]9;X;stdIn.nextInt();"+X);

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}