import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
System.out.println("[INST]6;s;scanner.next();"+s);
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
		for(int i=0;i<s.length();i++){
System.out.println("[INST]11;None;s.length();"+s.length());
			if(s.charAt(i) == 'S'){
System.out.println("[INST]12;None;s.charAt(i);"+s.charAt(i));
				checkS = true;
			}else if(s.charAt(i) == 'N'){
System.out.println("[INST]14;None;s.charAt(i);"+s.charAt(i));
				checkN = true;
			}else if(s.charAt(i) == 'W'){
System.out.println("[INST]16;None;s.charAt(i);"+s.charAt(i));
				checkW = true;
			}else if(s.charAt(i) == 'E'){
System.out.println("[INST]18;None;s.charAt(i);"+s.charAt(i));
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
