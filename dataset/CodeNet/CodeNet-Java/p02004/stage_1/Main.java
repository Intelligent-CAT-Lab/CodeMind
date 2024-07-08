import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    // 0を北とする
    int dir = 0;

    // 一周したかの判定にスタックを使う
    // Rでpush, Lでpopとすることで
    // sizeが5になったら1周完了、0なら回転失敗と判断
    Stack<Integer> stack = new Stack<Integer>();
var newVariable_0 = stack.add(0);    int result = 0;

var newVariable_1 = str.length();    for (int i = 0; i < newVariable_1; i++) {

      char command = str.charAt(i);

      // コマンドに応じて方向を計算する
      if (command == 'R') {
        dir++;
      } else {
        dir += 3;
      }
      dir %= 4;

      // 北を向いているとき
      // ここが回転の起点なのでスタック生成
      if (dir == 0 && stack == null) {
        stack = new Stack<Integer>();
var newVariable_2 = stack.add(0);      } else if (stack != null) {
        // 左回転
        if (command == 'L') {
var newVariable_3 = stack.pop();var newVariable_4 = stack.size();          if (newVariable_4 == 0) {
            stack = null;
          }
        }
        // 右回転
        else {
          stack.push(0);
var newVariable_5 = stack.size();          if (newVariable_5 == 5) {
            result++;
            stack.removeAllElements();
var newVariable_6 = stack.add(0);          }
        }
      }
    }

    System.out.println(result);
  }
}
