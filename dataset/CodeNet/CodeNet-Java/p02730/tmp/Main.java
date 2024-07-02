import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();
System.out.println("[INST]15;s;sc.next();"+s);
        char[] arr = s.toCharArray();
System.out.println("[INST]16;arr;s.toCharArray();"+arr);

        for (int i=0; i<s.length()/2; i++) {
System.out.println("[INST]18;None;s.length();"+s.length());
            if (arr[i]!=arr[s.length()-1-i]) {
System.out.println("[INST]19;None;s.length();"+s.length());
                out.print("No");
                out.flush();
System.out.println("[INST]21;None;out.flush();"+out.flush());
                return;
            }
        }

        for (int i=0; i<s.length()/2-1; i++) {
System.out.println("[INST]26;None;s.length();"+s.length());
            if (arr[i]!=arr[(s.length()/2)-1-i]) {
System.out.println("[INST]27;None;s.length();"+s.length());
                out.print("No");
                out.flush();
System.out.println("[INST]29;None;out.flush();"+out.flush());
                return;
            }
     
        }

        out.print("Yes");
        out.flush();
System.out.println("[INST]36;None;out.flush();"+out.flush());
    }

}
