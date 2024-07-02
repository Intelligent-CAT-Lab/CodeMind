

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
System.out.println("[INST]10;n;Integer.parseInt(scan.next());"+n);
System.out.println("[INST]10;None;scan.next();"+scan.next());
        scan.close();

        List<String> list = func(n);

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
            list.add("a");
System.out.println("[INST]24;None;list.add('a');"+list.add("a"));
        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // 含まれている最大の文字を探索
                char max = 'a';
                for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]30;None;s.length();"+s.length());
                    if (max < s.charAt(i)) {
System.out.println("[INST]31;None;s.charAt(i);"+s.charAt(i));
                        max = s.charAt(i);
System.out.println("[INST]32;max;s.charAt(i);"+max);
                    }
                }

                for (char c = 'a'; c <= max + 1; c++) {
                    String newString = s + c;
                    list.add(newString);
System.out.println("[INST]38;None;list.add(newString);"+list.add(newString));
                }
            }
        }
        return list;
    }
}
