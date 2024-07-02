import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
    int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
    int count = 0;
    for (int i = a; i <= b; i++) {
      String _i = new String().valueOf(i);
System.out.println("[INST]10;_i;new String().valueOf(i);"+_i);
      if (_i.charAt(0) == _i.charAt(4) && _i.charAt(1) == _i.charAt(3)) {
System.out.println("[INST]11;None;_i.charAt(0);"+_i.charAt(0));
System.out.println("[INST]11;None;_i.charAt(4);"+_i.charAt(4));
System.out.println("[INST]11;None;_i.charAt(1);"+_i.charAt(1));
System.out.println("[INST]11;None;_i.charAt(3);"+_i.charAt(3));
        count++;
      }
    }
    System.out.println(count);
  }

}
