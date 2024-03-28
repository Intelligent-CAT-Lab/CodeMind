import java.util.Scanner;

public class p00019 {
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		//calculation
		Long ans = 1L;
		for(Long N = sc.nextLong();N>1;N--){
			ans *= N;
		}
		//output
		System.out.println(ans);
	}
}



import java.util.Scanner;

public class p00019 {
	
	public static void main(String[] args) {

		# input
		sc = Scanner(System.in)
		
		# calculation
		ans = 1L
		for N in range(sc.nextLong(), 1, -1):
			ans *= N
		
		# output
		print(ans)
	}
}