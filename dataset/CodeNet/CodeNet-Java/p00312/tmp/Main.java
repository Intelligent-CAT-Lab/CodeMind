import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str1 = reader.readLine();
System.out.println("[INST]8;str1;reader.readLine();"+str1);
	    String s[]=str1.split(" ");
System.out.println("[INST]9;s;str1.split(' ');"+s);
	    int i1=Integer.parseInt(s[0]);
System.out.println("[INST]10;i1;Integer.parseInt(s[0]);"+i1);
	    int i2=Integer.parseInt(s[1]);
System.out.println("[INST]11;i2;Integer.parseInt(s[1]);"+i2);

	    int count=i1/i2;
	    count+=i1%i2;
	    System.out.println(count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

