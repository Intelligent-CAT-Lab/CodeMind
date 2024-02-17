

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, String> integerMap_ = new HashMap<Integer, String>();

    private static Map<String, Integer> stringMap_ = new HashMap<String, Integer>();;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        integerMap_.put(1, "a");
        integerMap_.put(2, "b");
        integerMap_.put(3, "c");
        integerMap_.put(4, "d");
        integerMap_.put(5, "e");
        integerMap_.put(6, "f");
        integerMap_.put(7, "g");
        integerMap_.put(8, "h");
        integerMap_.put(9, "i");
        integerMap_.put(10, "j");

        stringMap_.put("a", 1);
        stringMap_.put("b", 2);
        stringMap_.put("c", 3);
        stringMap_.put("d", 4);
        stringMap_.put("e", 5);
        stringMap_.put("f", 6);
        stringMap_.put("g", 7);
        stringMap_.put("h", 8);
        stringMap_.put("i", 9);
        stringMap_.put("j", 10);

        List<String> list = func(n);

        Collections.sort(list);

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
                // 含まれていない文字の探索
                String last = "a";
                for (int i = 1; i <= 10; i++) {
                    if (!s.contains(integerMap_.get(i))) {
                        last = integerMap_.get(i);
                        break;
                    }
                }

                for (int i = 1; i <= stringMap_.get(last); i++) {
                    String newString = s + integerMap_.get(i);
                    list.add(newString);
                }
            }
        }
        return list;
    }

}
