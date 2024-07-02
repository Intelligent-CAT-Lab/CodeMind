import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int w=in.nextInt();
System.out.println("[INST]8;w;in.nextInt();"+w);
		int h=in.nextInt();
System.out.println("[INST]9;h;in.nextInt();"+h);
		int x=in.nextInt();
System.out.println("[INST]10;x;in.nextInt();"+x);
		int y=in.nextInt();
System.out.println("[INST]11;y;in.nextInt();"+y);
		double ans=(double)w*(double)h/2;
		int a=0;
		if(x+x==w&&y+y==h)
			a=1;
		System.out.println(ans+" "+a);
	}
}
	