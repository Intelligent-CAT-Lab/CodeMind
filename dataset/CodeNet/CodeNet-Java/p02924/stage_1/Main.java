import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        int n = Integer.parseInt(newVariable_0);

        // 主処理
        long result = 0;
        for (int i = n - 1; 0 < i; i--) {
            result += i;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }

}