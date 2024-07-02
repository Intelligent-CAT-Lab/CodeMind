import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]8;s;sc.next();"+s);

        // 主処理
        char[] array = s.toCharArray();
System.out.println("[INST]11;array;s.toCharArray();"+array);
        int countC = 0;
        boolean judge = true;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                judge = judge && array[i] == 'A';

            } else if (2 <= i && i <= array.length - 2) {
                if (array[i] == 'C') {
                    countC++;
                } else {
                    judge = judge && Character.isLowerCase(array[i]);
System.out.println("[INST]22;None;Character.isLowerCase(array[i]);"+Character.isLowerCase(array[i]));
                }

            } else {
                judge = judge && Character.isLowerCase(array[i]);
System.out.println("[INST]26;None;Character.isLowerCase(array[i]);"+Character.isLowerCase(array[i]));
            }
        }
        String result = judge && countC == 1 ? "AC" : "WA";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
