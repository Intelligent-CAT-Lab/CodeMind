import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		char c;
		while((s=bf.readLine())!=null){
System.out.println("[INST]7;s;bf.readLine();"+s);
			t="";
			for(int i=0,j=s.length();i<j;i++)
System.out.println("[INST]9;j;s.length();"+j);
			{
				c=s.charAt(i);
System.out.println("[INST]11;c;s.charAt(i);"+c);
				t+=(char)((c>=97&&c<=123)?(c-32):(c));
			}
			System.out.println(t);
		}
	}
}