import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
var newVariable_0 = s.length();		for(int i=0;i<newVariable_0;i++){
var newVariable_1 = s.charAt(i);			if(newVariable_1 == 'S'){
				checkS = true;
var newVariable_2 = s.charAt(i);			}else if(newVariable_2 == 'N'){
				checkN = true;
var newVariable_3 = s.charAt(i);			}else if(newVariable_3 == 'W'){
				checkW = true;
var newVariable_4 = s.charAt(i);			}else if(newVariable_4 == 'E'){
				checkE = true;
			}
		}
		if(checkS == checkN && checkW == checkE){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
