import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		
		sc.close();
		
		int size = str.length();
		
		for(int i = 1 ; i < size ; i++){
			if(str.charAt(i) == str.charAt(i-1)){
				System.out.println(i + " " + (i+1));
				System.exit(0);
			}
		}
		
		for(int i = 2 ; i < size ; i++){
			if(str.charAt(i) == str.charAt(i-2)){
				System.out.println((i-1) + " " + (i+1));
				System.exit(0);
			}
		}
		
		System.out.println(-1 + " " + -1);
	}
}
