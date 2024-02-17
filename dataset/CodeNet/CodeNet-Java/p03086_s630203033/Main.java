import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();

    List<Character> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();


    for (int i = 0; i < S.length(); i++) {
      switch (S.charAt(i)) {
        case 'A':
        case 'T':
        case 'C':
        case 'G':
          list.add(S.charAt(i));
          break;
        default:
          if (!list.isEmpty()) {
            result.add(list.size());
            list = new ArrayList<>();
          }
          break;
      }
    }
    if (!list.isEmpty()) {
      result.add(list.size());
    }
    if (result.isEmpty()) {
      System.out.println(0);
    } else {
      System.out.println(result.stream().max((a, b) -> a.compareTo(b)).get());
    }
  }
}
