import java.util.Scanner;

public class p02801 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String C = sc.nextLine();
    char[] al = new char[26];
    for (int i = 0; i < 26; i++) {
      al[i] = (char) (i + 97);
    }
    int idx = -1;
    for (int i = 0; i < 26; i++) {
      if (C.equals(String.valueOf(al[i]))) {
        idx = i;
        break;
      }
    }
    if (idx == -1) {
      System.out.println("Invalid input");
    } else {
      System.out.println(al[idx + 1]);
    }
  }
}