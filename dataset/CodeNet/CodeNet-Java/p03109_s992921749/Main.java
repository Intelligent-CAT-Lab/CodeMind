import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static ArrayList<Integer>[] rec;
    static int[] size, id;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] buf = s.split("/");
        int mon = Integer.parseInt(buf[1]);
        int day = Integer.parseInt(buf[2]);
        String ans = mon<=4?"Heisei":"TBD";
        System.out.println(ans);
    }
}