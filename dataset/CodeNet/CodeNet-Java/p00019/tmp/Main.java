import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
System.out.println("[INST]11;N;sc.nextLong();"+N);
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}