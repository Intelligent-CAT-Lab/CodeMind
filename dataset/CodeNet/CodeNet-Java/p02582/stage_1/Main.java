import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
var newVariable_0 = s.charAt(0);var newVariable_1 = s.charAt(1);var newVariable_2 = s.charAt(2);        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && newVariable_2 == 'R') {
            res = 3;
var newVariable_3 = s.charAt(0);var newVariable_4 = s.charAt(1);        } else if (s.charAt(0) == 'R' && newVariable_4 == 'R') {
            res = 2;
var newVariable_5 = s.charAt(1);var newVariable_6 = s.charAt(2);        } else if (s.charAt(1) == 'R' && newVariable_6 == 'R') {
            res = 2;
var newVariable_7 = s.charAt(0);var newVariable_8 = s.charAt(1);var newVariable_9 = s.charAt(2);        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && newVariable_9 == 'S') {
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}