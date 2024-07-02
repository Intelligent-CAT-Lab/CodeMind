import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
System.out.println("[INST]5;br;System.getProperty('line.separator');"+br);
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){
        Long A = nextLong();
        Long B = nextLong();
        Long C = nextLong();

        Long max = B+C;

        if(C >= B) {
            C -= B;
            B = 0L;
        }else{
            B -= C;
            C = 0L;
        }

        if(C >= A){
            C -= A;
        }else{
            C = 0L;
        }

        println(C>0 ? max-C+1 : max);
    }

    static int nextInt(){
        return Integer.parseInt(next());
    }
    static Long nextLong(){
        return Long.parseLong(next());
    }
    static String next(){
        return sc.next();
    }
    static void println(Object o){
        PrintWriter out = new PrintWriter(System.out);
        out.println(o);
        out.flush();
System.out.println("[INST]44;None;out.flush();"+out.flush());
    }
   static void print(Object o){
       PrintWriter out = new PrintWriter(System.out);
       out.print(o);
       out.flush();
System.out.println("[INST]49;None;out.flush();"+out.flush());
    }
}
