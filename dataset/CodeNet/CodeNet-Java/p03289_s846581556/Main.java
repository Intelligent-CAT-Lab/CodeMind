import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        char[] array = s.toCharArray();
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
                }

            } else {
                judge = judge && Character.isLowerCase(array[i]);
            }
        }
        String result = judge && countC == 1 ? "AC" : "WA";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
