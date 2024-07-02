import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
System.out.println("[INST]5;S;sc.next();"+S);
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
System.out.println("[INST]7;None;S.length();"+S.length());
            int X = Integer.parseInt(S.substring(i, i + 3));
System.out.println("[INST]8;X;Integer.parseInt(S.substring(i, i + 3));"+X);
System.out.println("[INST]8;None;S.substring(i, i + 3);"+S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
System.out.println("[INST]9;min;Math.min(min, Math.abs(X - 753));"+min);
System.out.println("[INST]9;None;Math.abs(X - 753);"+Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}