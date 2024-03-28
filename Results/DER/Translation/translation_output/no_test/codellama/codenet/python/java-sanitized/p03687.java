import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        ArrayList<Character> SList = new ArrayList<Character>();
        for (int i = 0; i < S.length(); i++) {
            SList.add(S.charAt(i));
        }

        ArrayList<Integer> o = new ArrayList<Integer>();
        for (int i = 0; i < SList.size(); i++) {
            int j = 0;
            int m = 0;
            for (int j = 0; j < SList.size(); j++) {
                if (SList.get(i) == SList.get(j)) {
                    j = 0;
                } else {
                    j++;
                    m = Math.max(m, j);
                }
            }
            o.add(m);
        }

        int min = Collections.min(o);
        System.out.println(min);
    }
}