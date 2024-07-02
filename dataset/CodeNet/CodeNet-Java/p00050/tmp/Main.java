import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
System.out.println("[INST]5;str;sc.nextLine();"+str);
			  String ans=str.replace("apple", "wwwp");
System.out.println("[INST]6;ans;str.replace('apple', 'wwwp');"+ans);
			  ans=ans.replace("peach", "wwwa");
System.out.println("[INST]7;ans;ans.replace('peach', 'wwwa');"+ans);
			  ans=ans.replace("wwwp", "peach");
System.out.println("[INST]8;ans;ans.replace('wwwp', 'peach');"+ans);
			  ans=ans.replace("wwwa", "apple");
System.out.println("[INST]9;ans;ans.replace('wwwa', 'apple');"+ans);
			  System.out.println(ans);
		  }
	}
}
