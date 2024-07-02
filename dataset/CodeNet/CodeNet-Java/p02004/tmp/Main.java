import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
System.out.println("[INST]8;str;sc.next();"+str);
    // 0を北とする
    int dir = 0;

    // 一周したかの判定にスタックを使う
    // Rでpush, Lでpopとすることで
    // sizeが5になったら1周完了、0なら回転失敗と判断
    Stack<Integer> stack = new Stack<Integer>();
    stack.add(0);
System.out.println("[INST]16;None;stack.add(0);"+stack);
    int result = 0;

    for (int i = 0; i < str.length(); i++) {
System.out.println("[INST]19;None;str.length();"+str.length());

      char command = str.charAt(i);
System.out.println("[INST]21;command;str.charAt(i);"+command);

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
        stack.add(0);
System.out.println("[INST]35;None;stack.add(0);"+stack);
      } else if (stack != null) {
        // 左回転
        if (command == 'L') {
          stack.pop();
System.out.println("[INST]39;None;stack.pop();"+stack);
          if (stack.size() == 0) {
System.out.println("[INST]40;None;stack.size();"+stack.size());
            stack = null;
          }
        }
        // 右回転
        else {
          stack.push(0);
System.out.println("[INST]46;None;stack.push(0);"+stack);
          if (stack.size() == 5) {
System.out.println("[INST]47;None;stack.size();"+stack.size());
            result++;
            stack.removeAllElements();
// System.out.println("[INST]49;None;stack.removeAllElements();"+stack.removeAllElements());
            stack.add(0);
System.out.println("[INST]50;None;stack.add(0);"+stack);
          }
        }
      }
    }

    System.out.println(result);
  }
}
