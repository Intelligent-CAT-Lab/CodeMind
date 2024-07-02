import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
System.out.println("[INST]7;s;scanner.next().toCharArray();"+s);
System.out.println("[INST]7;None;scanner.next();"+scanner.next());
    int[] last = new int[26];
    Arrays.fill(last, -1);
System.out.println("[INST]9;None;Arrays.fill(last, -1);"+Arrays.fill(last, -1));
    for (int i = 0; i < s.length; i++) {
      int ch = s[i] - 'a';
      if (last[ch] >= 0 && i - last[ch] < 3) {
        System.out.printf("%d %d\n", last[ch] + 1, i + 1);
System.out.println("[INST]13;None;System.out.printf('%d %d\n', last[ch] + 1, i + 1);"+System.out.printf("%d %d\n", last[ch] + 1, i + 1));
        return;
      }
      last[ch] = i;
    }
    System.out.println("-1 -1");
  }
}
