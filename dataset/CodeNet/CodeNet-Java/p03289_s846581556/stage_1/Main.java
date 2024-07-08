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
var newVariable_0 = Character.isLowerCase(array[i]);                    judge = judge && newVariable_0;
                }

            } else {
var newVariable_1 = Character.isLowerCase(array[i]);                judge = judge && newVariable_1;
            }
        }
        String result = judge && countC == 1 ? "AC" : "WA";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
