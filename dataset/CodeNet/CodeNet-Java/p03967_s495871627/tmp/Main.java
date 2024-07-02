import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
        int count = 0;
        for (int i = 0 ; i < s.length() ; i++) {
System.out.println("[INST]8;None;s.length();"+s.length());
            if (s.substring(i, i + 1).equals("p")) {
System.out.println("[INST]9;None;s.substring(i, i + 1).equals('p');"+s.substring(i, i + 1).equals("p"));
System.out.println("[INST]9;None;s.substring(i, i + 1);"+s.substring(i, i + 1));
                count++;
            }
        }
        System.out.println(s.length()/2 - count);

    }

}