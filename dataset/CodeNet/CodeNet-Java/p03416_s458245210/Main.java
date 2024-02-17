import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      String _i = new String().valueOf(i);
      if (_i.charAt(0) == _i.charAt(4) && _i.charAt(1) == _i.charAt(3)) {
        count++;
      }
    }
    System.out.println(count);
  }

}
