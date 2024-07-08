import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int E = s.nextInt();
		int Y = s.nextInt();
		
		if (E == 0){
			if (Y <= 1911){
				System.out.print("M");
				System.out.println(Y - 1867);
			}else if(Y <= 1925){
				System.out.print("T");
				System.out.println(Y - 1911);
			}else if(Y <= 1988){
				System.out.print("S");
				System.out.println(Y - 1925);
			}else{
				System.out.print("H");
				System.out.println(Y - 1988);
			}
		} else if(E == 1){
			System.out.println(1867 + Y);
		}else if(E == 2){
			System.out.println(1911 + Y);
		}else if(E == 3){
			System.out.println(1925 + Y);
		}else{
			System.out.println(1988 + Y);
		}
	}
}