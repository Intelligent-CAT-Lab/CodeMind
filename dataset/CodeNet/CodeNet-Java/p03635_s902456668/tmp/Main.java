import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
System.out.println("[INST]6;int1;Integer.parseInt(scan.next());"+int1);
System.out.println("[INST]6;None;scan.next();"+scan.next());
        int int2 = Integer.parseInt(scan.next());
System.out.println("[INST]7;int2;Integer.parseInt(scan.next());"+int2);
System.out.println("[INST]7;None;scan.next();"+scan.next());
//        int int3 = Integer.parseInt(scan.next());
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
//        String str1 = scan.next();
        int ans_int = 0;
        String ans = "";
//        double ans_dob = 0;

        ans_int = (int1-1) * (int2-1);

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
System.out.println("[INST]21;None;out.flush();"+out.flush());
        scan.close();
    }
}
