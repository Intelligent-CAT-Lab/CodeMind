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
        char[] arr = s.toCharArray();

var newVariable_0 = s.length();        for (int i=0; i<newVariable_0/2; i++) {
var newVariable_1 = s.length();            if (arr[i]!=arr[newVariable_1-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
        }

var newVariable_2 = s.length();        for (int i=0; i<newVariable_2/2-1; i++) {
var newVariable_3 = s.length();            if (arr[i]!=arr[(newVariable_3/2)-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
     
        }

        out.print("Yes");
        out.flush();
    }

}
