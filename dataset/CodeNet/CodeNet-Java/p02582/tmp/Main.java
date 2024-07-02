import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
System.out.println("[INST]8;s;read.readLine();"+s);
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
System.out.println("[INST]10;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]10;None;s.charAt(1);"+s.charAt(1));
System.out.println("[INST]10;None;s.charAt(2);"+s.charAt(2));
            res = 3;
        } else if (s.charAt(0) == 'R' && s.charAt(1) == 'R') {
System.out.println("[INST]12;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]12;None;s.charAt(1);"+s.charAt(1));
            res = 2;
        } else if (s.charAt(1) == 'R' && s.charAt(2) == 'R') {
System.out.println("[INST]14;None;s.charAt(1);"+s.charAt(1));
System.out.println("[INST]14;None;s.charAt(2);"+s.charAt(2));
            res = 2;
        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
System.out.println("[INST]16;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]16;None;s.charAt(1);"+s.charAt(1));
System.out.println("[INST]16;None;s.charAt(2);"+s.charAt(2));
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}