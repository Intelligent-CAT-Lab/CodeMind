Solution


import java.util.Scanner;

public class p00084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		code = code.replace(",", "");
		code = code.replace(".", "");
		code = code.split("");
		
		List<String> list = new ArrayList<String>();
		
		for (String var : code) {
			if (var.length() >= 3 && var.length() <= 6) {
				list.add(var);
			}
		}
		
		for (String var : list) {
			System.out.println(var);
		}
	}

}