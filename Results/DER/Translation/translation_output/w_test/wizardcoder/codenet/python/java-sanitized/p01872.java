import java.util.*;

public class p01872 {
  public static boolean isCollect(String fixedNumber) {
    int score = 0;
    for (int i = 1; i < 7; i++) {
      score += (fixedNumber.charAt(i) - '0') * (i + 1);
    }
    for (int i = 7; i < 12; i++) {
      score += (fixedNumber.charAt(i) - '0') * (i - 5);
    }
    int last = 11 - score % 11;
    if (last == 10) {
      return fixedNumber.charAt(0) == '0';
    } else {
      return last == (fixedNumber.charAt(0) - '0');
    }
  }

  public static int check(String s) {
    int index = s.indexOf('?');
    int cnt = 0;
    for (int i = 0; i < 10; i++) {
      String c = String.valueOf(i);
      String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
      if (isCollect(fixedNumber)) {
        cnt++;
        ret = i;
      }
    }
    if (cnt == 1) {
      return ret;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = new StringBuilder(s).reverse().toString();
    int ans = check(s);
    System.out.println(ans == -1? "MULTIPLE" : ans);
  }
}