import java.util.*;
import java.io.*;
 
import static java.lang.System.in;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]8;n;sc.nextLong();"+n);
        long P = sc.nextLong();
System.out.println("[INST]9;P;sc.nextLong();"+P);
        if(n==1){
            System.out.println(P);
            System.exit(0);
System.out.println("[INST]12;None;System.exit(0);"+System.exit(0));
        }
        long upper = (long) Math.sqrt(P)+1;
System.out.println("[INST]14;None;Math.sqrt(P);"+Math.sqrt(P));
        long ans=1;
        for(long i=2;i<=upper&&i<=P;i++){
            if(P%i!=0) continue;
            long cnt=0;
            while(P%i==0){
                cnt++;
                P = P/i;
            }
            long now = cnt/n;
            ans*=(long) Math.pow(i,now);
System.out.println("[INST]24;None;Math.pow(i,now);"+Math.pow(i,now));
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
System.out.println("[INST]28;None;out.flush();"+out.flush());
    }
}