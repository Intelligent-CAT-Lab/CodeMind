import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
System.out.println("[INST]7;r;Double.parseDouble(br.readLine());"+r);
System.out.println("[INST]7;None;br.readLine();"+br.readLine());
		double pi = Math.PI;
		double x = r*r*pi;
		double y = 2*r*pi;
		System.out.printf("%.6f %.6f",x,y);
System.out.println("[INST]11;None;System.out.printf('%.6f %.6f',x,y);"+System.out.printf("%.6f %.6f",x,y));
	}
}