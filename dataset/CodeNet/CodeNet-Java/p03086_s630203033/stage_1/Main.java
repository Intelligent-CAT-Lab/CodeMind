import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();

    List<Character> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();


var newVariable_0 = S.length();    for (int i = 0; i < newVariable_0; i++) {
var newVariable_1 = S.charAt(i);      switch (newVariable_1) {
        case 'A':
        case 'T':
        case 'C':
        case 'G':
var newVariable_2 = list.add(S.charAt(i));var newVariable_3 = S.charAt(i);          list.add(newVariable_3);
          break;
        default:
var newVariable_4 = list.isEmpty();          if (!newVariable_4) {
var newVariable_5 = result.add(list.size());var newVariable_6 = list.size();            result.add(newVariable_6);
            list = new ArrayList<>();
          }
          break;
      }
    }
var newVariable_7 = list.isEmpty();    if (!newVariable_7) {
var newVariable_8 = result.add(list.size());var newVariable_9 = list.size();      result.add(newVariable_9);
    }
var newVariable_10 = result.isEmpty();    if (newVariable_10) {
      System.out.println(0);
    } else {
      System.out.println(result.stream().max((a, b) -> a.compareTo(b)).get());
    }
  }
}
