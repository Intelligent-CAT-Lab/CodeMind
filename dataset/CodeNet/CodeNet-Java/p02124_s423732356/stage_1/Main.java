import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.hasNext();		while(newVariable_0) {
			int a = sc.nextInt();
			String str = "ai1333";
			
			int b = a/100;
			if(b>0)
			for(int i=1;i<=b;i++) {
				str += 3;
			}
			System.out.println(str);
		}
	
	}
}
