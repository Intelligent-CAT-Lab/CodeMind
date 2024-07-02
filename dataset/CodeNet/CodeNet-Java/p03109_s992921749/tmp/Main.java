import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static ArrayList<Integer>[] rec;
    static int[] size, id;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]9;s;sc.next();"+s);
        String[] buf = s.split("/");
System.out.println("[INST]10;buf;s.split('/');"+buf);
        int mon = Integer.parseInt(buf[1]);
System.out.println("[INST]11;mon;Integer.parseInt(buf[1]);"+mon);
        int day = Integer.parseInt(buf[2]);
System.out.println("[INST]12;day;Integer.parseInt(buf[2]);"+day);
        String ans = mon<=4?"Heisei":"TBD";
        System.out.println(ans);
    }
}