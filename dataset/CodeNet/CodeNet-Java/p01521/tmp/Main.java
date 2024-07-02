import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
System.out.println("[INST]6;c;in.next().toCharArray();"+c);
System.out.println("[INST]6;None;in.next();"+in.next());
		System.out.println(c[0]=='x'&&c[c.length-1]=='x' ? "x":"o");
	}
}