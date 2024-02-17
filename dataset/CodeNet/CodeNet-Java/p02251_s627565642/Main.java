import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    int n=Integer.parseInt(reader.readLine());
	    int result=0;
	    
		result=n/25;
		n=n%25;
		result+=n/10;
		n=n%10;
		result+=n/5;
		n=n%5;
	    
		
	    System.out.println(result+n);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}

