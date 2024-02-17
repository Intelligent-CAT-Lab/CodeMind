import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt();
		String ans = "";
		
		while(w != 0) {
			int tmp = w % 3;
			
			if(tmp == 0) {
				ans = "0" + ans;
				w /= 3;
				
			} else if(tmp == 1) {
				ans = "+" + ans;
				w /= 3;
				
			} else if(tmp == 2) {
				ans = "-" + ans;
				w /= 3;
				w++;
			}
		}
		
		System.out.println(ans);
		
		scan.close();
	}
}