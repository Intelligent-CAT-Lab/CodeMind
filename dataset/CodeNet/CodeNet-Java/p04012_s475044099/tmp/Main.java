import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String w;
        int list[] = new int[26];

        w = sc.nextLine();
System.out.println("[INST]11;w;sc.nextLine();"+w);
        
        for (int i = 0; i < w.length(); i++) {
System.out.println("[INST]13;None;w.length();"+w.length());
            //char a=97 b=122
            list[w.charAt(i) - 97]++;
System.out.println("[INST]15;None;w.charAt(i);"+w.charAt(i));
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