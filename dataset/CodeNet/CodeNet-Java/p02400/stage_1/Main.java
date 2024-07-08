import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();		double r = Double.parseDouble(newVariable_0);
		double pi = Math.PI;
		double x = r*r*pi;
		double y = 2*r*pi;
var newVariable_1 = System.out.printf("%.6f %.6f",x,y);	}
}