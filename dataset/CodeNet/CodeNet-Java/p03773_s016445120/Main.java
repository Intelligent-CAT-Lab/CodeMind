import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
		int str2 = sc.nextInt();
		
		int kei = str1 + str2;
		if(kei < 24){
			System.out.println(kei); 
		}
		else{
			System.out.println(kei - 24); 
		}
		
	  }
	}