import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
System.out.println("[INST]8;a;sc.next();"+a);
		String[] b = a.split("");
System.out.println("[INST]9;b;a.split('');"+b);
		
		int c=a.length();
System.out.println("[INST]11;c;a.length();"+c);
		
		if(c==3){
			String str=b[0];
			b[0]=b[2];
			b[2]=str;
		}
		
		for(int i=0;i<c;i++){		
			System.out.print(b[i]);
		} 
	}

}
