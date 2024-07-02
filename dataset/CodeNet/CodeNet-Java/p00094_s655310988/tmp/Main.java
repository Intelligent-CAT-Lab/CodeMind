import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
System.out.println("[INST]4;str;br.readLine().split(' ');"+str);
System.out.println("[INST]4;None;br.readLine();"+br.readLine());
		double a = Double.parseDouble(str[0]);
System.out.println("[INST]5;a;Double.parseDouble(str[0]);"+a);
		double b = Double.parseDouble(str[1]);
System.out.println("[INST]6;b;Double.parseDouble(str[1]);"+b);
		System.out.println(a*b/3.305785);
	}

}