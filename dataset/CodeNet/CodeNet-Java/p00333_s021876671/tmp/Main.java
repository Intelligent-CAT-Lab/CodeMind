import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
System.out.println("[INST]10;str;reader.readLine();"+str);
	    String s[]=str.split(" ");
System.out.println("[INST]11;s;str.split(' ');"+s);
	    int w=Integer.parseInt(s[0]);
System.out.println("[INST]12;w;Integer.parseInt(s[0]);"+w);
	    int h=Integer.parseInt(s[1]);
System.out.println("[INST]13;h;Integer.parseInt(s[1]);"+h);
	    int c=Integer.parseInt(s[2]);
System.out.println("[INST]14;c;Integer.parseInt(s[2]);"+c);

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

