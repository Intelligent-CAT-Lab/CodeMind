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
System.out.println("[INST]22;None;f.readLine();"+f.readLine());
        long i = Long.parseLong(st.nextToken());
System.out.println("[INST]23;i;Long.parseLong(st.nextToken());"+i);
System.out.println("[INST]23;None;st.nextToken();"+st.nextToken());
        char ch = st.nextToken().charAt(0);
System.out.println("[INST]24;ch;st.nextToken().charAt(0);"+ch);
System.out.println("[INST]24;None;st.nextToken();"+st.nextToken());
        long j = Long.parseLong(st.nextToken());
System.out.println("[INST]25;j;Long.parseLong(st.nextToken());"+j);
System.out.println("[INST]25;None;st.nextToken();"+st.nextToken());
        
        if(ch == '+') {
            System.out.println(i + j);
        }
        else {
            System.out.println(i - j);
        }
    }

}
