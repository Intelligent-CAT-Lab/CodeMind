import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str1 = null;


        PrintWriter out = new PrintWriter(System.out);
        try {
            str1 = br.readLine();
System.out.println("[INST]17;str1;br.readLine();"+str1);

            int intCnt1 = 0;
            int intCnt2 = 0;

        	boolean bIsWhite = true;
            for (int i=0 ; i < str1.length() ; i++) {
System.out.println("[INST]23;None;str1.length();"+str1.length());

            	if (str1.charAt(i) == (bIsWhite ? '0' : '1')) {
System.out.println("[INST]25;None;str1.charAt(i);"+str1.charAt(i));
            		intCnt1++;
            	} else {
            		intCnt2++;
            	}
            	bIsWhite = !bIsWhite;
            }


            System.out.println(intCnt1 < intCnt2 ? intCnt1 : intCnt2 );


        } catch (IOException e) {

        }


    }
}