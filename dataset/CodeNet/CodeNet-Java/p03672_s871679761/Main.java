import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    for (int i = S.length - 1; i >= 0; i --) {
      if (isEven(S, 0, i)) {
        System.out.println(i);
        return;
      }
    }
  }

  private static boolean isEven(char[] s, int head, int tail) {
    if (head >= tail) return false;
    if ((tail - head) % 2 != 0) return false;
    int mid = (tail - head) / 2 + head;
    for (int i = 0; i < mid - head; i++) {
      if (s[head + i] != s[mid + i]) return false;
    }
    return true;
  }
}
