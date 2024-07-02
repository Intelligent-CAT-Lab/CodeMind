import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String str = f.readLine();
System.out.println("[INST]7;str;f.readLine();"+str);
        int n = str.length();
System.out.println("[INST]8;n;str.length();"+n);
        long sum = 0;
        int ptr = 0;
        long cnt = 0;
        long curr = 0;
        while(ptr < n){
            if(str.charAt(ptr) == '>'){
System.out.println("[INST]14;None;str.charAt(ptr);"+str.charAt(ptr));
                while(ptr < n && str.charAt(ptr) == '>'){
System.out.println("[INST]15;None;str.charAt(ptr);"+str.charAt(ptr));
                    ptr++;
                    cnt++;
                }
                if(curr > cnt){
                    sum+=(curr+(((cnt)*(cnt-1))/2));
                }else{
                    sum+=(((cnt+1)*(cnt))/2);
                }
                curr = 0;
                cnt = 0;
            }else{
                sum+=curr;
                curr++;
                ptr++;
            }
        }
        if(str.charAt(n-1) == '<') sum+=curr;
System.out.println("[INST]32;None;str.charAt(n-1);"+str.charAt(n-1));
        out.println(sum);
        out.close();
    }
}
