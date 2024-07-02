import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
System.out.println("[INST]5;None;sc.hasNext();"+sc.hasNext());
				String str = sc.nextLine();
System.out.println("[INST]6;str;sc.nextLine();"+str);
				str = str.replace('.', ',');
System.out.println("[INST]7;str;str.replace('.', ',');"+str);
				str = str.replace(',', ' ');
System.out.println("[INST]8;str;str.replace(',', ' ');"+str);
				String[] tokens = str.split(" ");
System.out.println("[INST]9;tokens;str.split(' ');"+tokens);
				int count = 0;
				
				for(int i=0; i<tokens.length; i++) {
					int n = tokens[i].length();
System.out.println("[INST]13;n;tokens[i].length();"+n);
					
					if(n>=3 && n<=6) {
						if(count > 0) System.out.print(" ");
						System.out.print(tokens[i].substring(0,n));
						count++;
					}
				}
				if(count > 0) System.out.println();
			}
		}
	}
}
