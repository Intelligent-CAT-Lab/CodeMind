import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String[] sArray = new String[3];
    sArray[0] = s.split("")[0];
    sArray[1] = s.split("")[1];
    sArray[2] = s.split("")[2];
    int count = 0;

    if (sArray[0].equals("1")) count += 1;
    if (sArray[1].equals("1")) count += 1;
    if (sArray[2].equals("1")) count += 1;

    System.out.println(count);
  }
}
