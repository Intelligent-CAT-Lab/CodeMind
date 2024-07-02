import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
    String[] sArray = new String[3];
    sArray[0] = s.split("")[0];
System.out.println("[INST]8;None;s.split('');"+s.split(""));
    sArray[1] = s.split("")[1];
System.out.println("[INST]9;None;s.split('');"+s.split(""));
    sArray[2] = s.split("")[2];
System.out.println("[INST]10;None;s.split('');"+s.split(""));
    int count = 0;

    if (sArray[0].equals("1")) count += 1;
System.out.println("[INST]13;None;sArray[0].equals('1');"+sArray[0].equals("1"));
    if (sArray[1].equals("1")) count += 1;
System.out.println("[INST]14;None;sArray[1].equals('1');"+sArray[1].equals("1"));
    if (sArray[2].equals("1")) count += 1;
System.out.println("[INST]15;None;sArray[2].equals('1');"+sArray[2].equals("1"));

    System.out.println(count);
  }
}
