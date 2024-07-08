

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
var newVariable_0 = scan.next();        int n = Integer.parseInt(newVariable_0);
        scan.close();

var newVariable_1 = integerMap_.put(1, "a");var newVariable_2 = integerMap_.put(2, "b");var newVariable_3 = integerMap_.put(3, "c");var newVariable_4 = integerMap_.put(4, "d");var newVariable_5 = integerMap_.put(5, "e");var newVariable_6 = integerMap_.put(6, "f");var newVariable_7 = integerMap_.put(7, "g");var newVariable_8 = integerMap_.put(8, "h");var newVariable_9 = integerMap_.put(9, "i");var newVariable_10 = integerMap_.put(10, "j");
var newVariable_11 = stringMap_.put("a", 1);var newVariable_12 = stringMap_.put("b", 2);var newVariable_13 = stringMap_.put("c", 3);var newVariable_14 = stringMap_.put("d", 4);var newVariable_15 = stringMap_.put("e", 5);var newVariable_16 = stringMap_.put("f", 6);var newVariable_17 = stringMap_.put("g", 7);var newVariable_18 = stringMap_.put("h", 8);var newVariable_19 = stringMap_.put("i", 9);var newVariable_20 = stringMap_.put("j", 10);
        List<String> list = func(n);

        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
var newVariable_21 = list.add("a");        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // 含まれていない文字の探索
                String last = "a";
                for (int i = 1; i <= 10; i++) {
var newVariable_22 = s.contains(integerMap_.get(i));var newVariable_23 = integerMap_.get(i);                    if (!s.contains(newVariable_23)) {
                        last = integerMap_.get(i);
                        break;
                    }
                }

var newVariable_24 = stringMap_.get(last);                for (int i = 1; i <= newVariable_24; i++) {
var newVariable_25 = integerMap_.get(i);                    String newString = s + newVariable_25;
var newVariable_26 = list.add(newString);                }
            }
        }
        return list;
    }

}
