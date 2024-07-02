

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
System.out.println("[INST]17;n;Integer.parseInt(scan.next());"+n);
System.out.println("[INST]17;None;scan.next();"+scan.next());
        scan.close();

        integerMap_.put(1, "a");
System.out.println("[INST]20;None;integerMap_.put(1, 'a');"+integerMap_.put(1, "a"));
        integerMap_.put(2, "b");
System.out.println("[INST]21;None;integerMap_.put(2, 'b');"+integerMap_.put(2, "b"));
        integerMap_.put(3, "c");
System.out.println("[INST]22;None;integerMap_.put(3, 'c');"+integerMap_.put(3, "c"));
        integerMap_.put(4, "d");
System.out.println("[INST]23;None;integerMap_.put(4, 'd');"+integerMap_.put(4, "d"));
        integerMap_.put(5, "e");
System.out.println("[INST]24;None;integerMap_.put(5, 'e');"+integerMap_.put(5, "e"));
        integerMap_.put(6, "f");
System.out.println("[INST]25;None;integerMap_.put(6, 'f');"+integerMap_.put(6, "f"));
        integerMap_.put(7, "g");
System.out.println("[INST]26;None;integerMap_.put(7, 'g');"+integerMap_.put(7, "g"));
        integerMap_.put(8, "h");
System.out.println("[INST]27;None;integerMap_.put(8, 'h');"+integerMap_.put(8, "h"));
        integerMap_.put(9, "i");
System.out.println("[INST]28;None;integerMap_.put(9, 'i');"+integerMap_.put(9, "i"));
        integerMap_.put(10, "j");
System.out.println("[INST]29;None;integerMap_.put(10, 'j');"+integerMap_.put(10, "j"));

        stringMap_.put("a", 1);
System.out.println("[INST]31;None;stringMap_.put('a', 1);"+stringMap_.put("a", 1));
        stringMap_.put("b", 2);
System.out.println("[INST]32;None;stringMap_.put('b', 2);"+stringMap_.put("b", 2));
        stringMap_.put("c", 3);
System.out.println("[INST]33;None;stringMap_.put('c', 3);"+stringMap_.put("c", 3));
        stringMap_.put("d", 4);
System.out.println("[INST]34;None;stringMap_.put('d', 4);"+stringMap_.put("d", 4));
        stringMap_.put("e", 5);
System.out.println("[INST]35;None;stringMap_.put('e', 5);"+stringMap_.put("e", 5));
        stringMap_.put("f", 6);
System.out.println("[INST]36;None;stringMap_.put('f', 6);"+stringMap_.put("f", 6));
        stringMap_.put("g", 7);
System.out.println("[INST]37;None;stringMap_.put('g', 7);"+stringMap_.put("g", 7));
        stringMap_.put("h", 8);
System.out.println("[INST]38;None;stringMap_.put('h', 8);"+stringMap_.put("h", 8));
        stringMap_.put("i", 9);
System.out.println("[INST]39;None;stringMap_.put('i', 9);"+stringMap_.put("i", 9));
        stringMap_.put("j", 10);
System.out.println("[INST]40;None;stringMap_.put('j', 10);"+stringMap_.put("j", 10));

        List<String> list = func(n);

        Collections.sort(list);
System.out.println("[INST]44;None;Collections.sort(list);"+Collections.sort(list));

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
            list.add("a");
System.out.println("[INST]55;None;list.add('a');"+list.add("a"));
        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // 含まれていない文字の探索
                String last = "a";
                for (int i = 1; i <= 10; i++) {
                    if (!s.contains(integerMap_.get(i))) {
System.out.println("[INST]62;None;s.contains(integerMap_.get(i));"+s.contains(integerMap_.get(i)));
System.out.println("[INST]62;None;integerMap_.get(i);"+integerMap_.get(i));
                        last = integerMap_.get(i);
System.out.println("[INST]63;last;integerMap_.get(i);"+last);
                        break;
                    }
                }

                for (int i = 1; i <= stringMap_.get(last); i++) {
System.out.println("[INST]68;None;stringMap_.get(last);"+stringMap_.get(last));
                    String newString = s + integerMap_.get(i);
System.out.println("[INST]69;None;integerMap_.get(i);"+integerMap_.get(i));
                    list.add(newString);
System.out.println("[INST]70;None;list.add(newString);"+list.add(newString));
                }
            }
        }
        return list;
    }

}
