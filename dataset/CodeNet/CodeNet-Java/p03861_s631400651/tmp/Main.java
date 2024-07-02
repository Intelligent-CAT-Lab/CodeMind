import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    long a = 0;
    long b = 0;
    long x = 0;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] tmp = br.readLine().split("\\s");
System.out.println("[INST]12;tmp;br.readLine().split('\\s');"+tmp);
System.out.println("[INST]12;None;br.readLine();"+br.readLine());
      a = Long.parseLong(tmp[0]);
System.out.println("[INST]13;a;Long.parseLong(tmp[0]);"+a);
      b = Long.parseLong(tmp[1]);
System.out.println("[INST]14;b;Long.parseLong(tmp[1]);"+b);
      x = Long.parseLong(tmp[2]);
System.out.println("[INST]15;x;Long.parseLong(tmp[2]);"+x);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
System.out.println("[INST]18;None;System.exit(1);"+System.exit(1));
    }


    long sum = (b / x) + 1;
    long diff = (a / x) + 1;
    if (a % x == 0) {
      diff--;
    }
    System.out.print(sum - diff);
  }
}
