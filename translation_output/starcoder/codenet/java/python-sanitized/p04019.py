import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = False;
		boolean checkN = False;
		boolean checkW = False;
		boolean checkE = False;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'S'){
				checkS = True;
			}else if(s.charAt(i) == 'N'){
				checkN = True;
			}else if(s.charAt(i) == 'W'){
				checkW = True;
			}else if(s.charAt(i) == 'E'){
				checkE = True;
			}
		}
		if(checkS == checkN and checkW == checkE):
			System.out.println("Yes");
		else:
			System.out.println("No");
	}

}