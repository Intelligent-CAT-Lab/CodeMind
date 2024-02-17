

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
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
        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // 含まれている最大の文字を探索
                char max = 'a';
                for (int i = 0; i < s.length(); i++) {
                    if (max < s.charAt(i)) {
                        max = s.charAt(i);
                    }
                }

                for (char c = 'a'; c <= max + 1; c++) {
                    String newString = s + c;
                    list.add(newString);
                }
            }
        }
        return list;
    }
}
