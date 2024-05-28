import java.io.*;

public class p00020 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		char c;
		while((s=bf.readLine())!=null){
			t="";for(int i=0,j=s.length();i<j;i++){c=s.charAt(i);t+=(char)((c>=97&&c<=123)?(c-32):(c));}
			System.out.println(t);
		}
	}
}