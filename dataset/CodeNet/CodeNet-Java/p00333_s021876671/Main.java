import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
	    String s[]=str.split(" ");
	    int w=Integer.parseInt(s[0]);
	    int h=Integer.parseInt(s[1]);
	    int c=Integer.parseInt(s[2]);

	    int fee=0;
	    
	    int gc=gcd(w,h);
	    int gw=w/gc;
	    int gh=h/gc;
	    fee=(gw*gh)*c;
	    
	    System.out.println(fee);
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

