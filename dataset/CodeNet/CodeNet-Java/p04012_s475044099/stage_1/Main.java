import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String w;
        int list[] = new int[26];

        w = sc.nextLine();
        
var newVariable_0 = w.length();        for (int i = 0; i < newVariable_0; i++) {
            //char a=97 b=122
var newVariable_1 = w.charAt(i);            list[newVariable_1 - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if(list[i]%2 != 0) {
                out.println("No");

                sc.close();
                return;
            }
        }

        out.println("Yes");
        sc.close();
    }
}