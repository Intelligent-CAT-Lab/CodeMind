

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
var newVariable_0 = scan.next();        int n = Integer.parseInt(newVariable_0);
        scan.close();

        List<String> list = func(n);

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
var newVariable_1 = list.add("a");        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // 含まれている最大の文字を探索
                char max = 'a';
var newVariable_2 = s.length();                for (int i = 0; i < newVariable_2; i++) {
var newVariable_3 = s.charAt(i);                    if (max < newVariable_3) {
                        max = s.charAt(i);
                    }
                }

                for (char c = 'a'; c <= max + 1; c++) {
                    String newString = s + c;
var newVariable_4 = list.add(newString);                }
            }
        }
        return list;
    }
}
