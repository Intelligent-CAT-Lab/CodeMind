import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str1 = reader.readLine();
	    String s[]=str1.split(" ");
	    int i1=Integer.parseInt(s[0]);
	    int i2=Integer.parseInt(s[1]);

	    int count=i1/i2;
	    count+=i1%i2;
	    System.out.println(count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

