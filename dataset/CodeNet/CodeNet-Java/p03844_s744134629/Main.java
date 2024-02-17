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
        StringTokenizer st = new StringTokenizer(f.readLine());
        long i = Long.parseLong(st.nextToken());
        char ch = st.nextToken().charAt(0);
        long j = Long.parseLong(st.nextToken());
        
        if(ch == '+') {
            System.out.println(i + j);
        }
        else {
            System.out.println(i - j);
        }
    }

}
