import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
System.out.println("[INST]6;str1;sc.nextInt();"+str1);
		int str2 = sc.nextInt();
System.out.println("[INST]7;str2;sc.nextInt();"+str2);
		
		int kei = str1 + str2;
		if(kei < 24){
			System.out.println(kei); 
		}
		else{
			System.out.println(kei - 24); 
		}
		
	  }
	}