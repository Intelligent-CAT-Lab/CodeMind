import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
        int acnt = 0;
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]9;None;s.length();"+s.length());
            char c = s.charAt(i);
System.out.println("[INST]10;c;s.charAt(i);"+c);
            if (c == 'A') {
                acnt++;
            } else if (c == 'B' && i < s.length() - 1 && s.charAt(i + 1) == 'C') {
System.out.println("[INST]13;None;s.length();"+s.length());
System.out.println("[INST]13;None;s.charAt(i + 1);"+s.charAt(i + 1));
                sum += acnt;
                i++;
            } else {
                acnt = 0;
            }
        }
        System.out.println(sum);
    }
}
