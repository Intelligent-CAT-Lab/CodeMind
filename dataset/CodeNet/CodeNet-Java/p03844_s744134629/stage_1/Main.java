/*
ID: andy.sc1
LANG: JAVA
TASK: addsub
*/

// Imports
import java.util.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     * @throws IOException, FileNotFoundException 
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        
        // TODO UNCOMMENT WHEN ALGORITHM CORRECT
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        
        // TODO code application logic here
var newVariable_0 = f.readLine();        StringTokenizer st = new StringTokenizer(newVariable_0);
var newVariable_1 = st.nextToken();        long i = Long.parseLong(newVariable_1);
var newVariable_2 = st.nextToken();        char ch = newVariable_2.charAt(0);
var newVariable_3 = st.nextToken();        long j = Long.parseLong(newVariable_3);
        
        if(ch == '+') {
            System.out.println(i + j);
        }
        else {
            System.out.println(i - j);
        }
    }

}
