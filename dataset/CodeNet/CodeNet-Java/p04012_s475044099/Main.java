import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String w;
        int list[] = new int[26];

        w = sc.nextLine();
        
        for (int i = 0; i < w.length(); i++) {
            //char a=97 b=122
            list[w.charAt(i) - 97]++;
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