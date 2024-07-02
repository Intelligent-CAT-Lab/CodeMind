import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
System.out.println("[INST]7;S;scan.nextLine();"+S);

    List<Character> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();


    for (int i = 0; i < S.length(); i++) {
System.out.println("[INST]13;None;S.length();"+S.length());
      switch (S.charAt(i)) {
System.out.println("[INST]14;None;S.charAt(i);"+S.charAt(i));
        case 'A':
        case 'T':
        case 'C':
        case 'G':
          list.add(S.charAt(i));
System.out.println("[INST]19;None;list.add(S.charAt(i));"+list.add(S.charAt(i)));
System.out.println("[INST]19;None;S.charAt(i);"+S.charAt(i));
          break;
        default:
          if (!list.isEmpty()) {
System.out.println("[INST]22;None;list.isEmpty();"+list.isEmpty());
            result.add(list.size());
System.out.println("[INST]23;None;result.add(list.size());"+result.add(list.size()));
System.out.println("[INST]23;None;list.size();"+list.size());
            list = new ArrayList<>();
          }
          break;
      }
    }
    if (!list.isEmpty()) {
System.out.println("[INST]29;None;list.isEmpty();"+list.isEmpty());
      result.add(list.size());
System.out.println("[INST]30;None;result.add(list.size());"+result.add(list.size()));
System.out.println("[INST]30;None;list.size();"+list.size());
    }
    if (result.isEmpty()) {
System.out.println("[INST]32;None;result.isEmpty();"+result.isEmpty());
      System.out.println(0);
    } else {
      System.out.println(result.stream().max((a, b) -> a.compareTo(b)).get());
    }
  }
}
